package com.shetty;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PassengerController {
@Autowired
RestTemplate template;	
	
	@RequestMapping("/passengerForm")
	String passengerForm() {
		return "passenger";
	}
	@RequestMapping("/createPassenger")
	ModelAndView passengerCreation(HttpServletRequest res1) {
		System.out.println("entered passeneger loop");
		Passenger pass=new Passenger(res1.getParameter("pname"),res1.getParameter("pmail"));
		System.out.println(pass.getName()+pass.getEmail());
		
		ModelAndView mv= new ModelAndView("success");
		Map<String, Passenger> passData=new HashMap<String, Passenger>();
		passData.put("passen", pass);
		
		PassenegerDAO dao=new PassenegerDAO();
		int genid=dao.generatedId(pass);
		
		mv.addAllObjects(passData);
		return mv;
			
	}

	@RequestMapping("/serviceInfo")
	ModelAndView servicesInformation() {
		Services[] serviceArray= template.
				getForEntity("http://localhost:8090/service", Services[].class).getBody();
		List<Services> serviceList=Arrays.asList(serviceArray);
		Map<Integer,Services> serviceMap=new HashMap<Integer, Services>();
		Map<String, Services> serviceData=new HashMap<String, Services>();
		for (Services services : serviceList) {
			serviceMap.put(services.getRouteId(), services);
			serviceData.put(services.getRouteDesc(), services);
		}
		
		ModelAndView mv=new ModelAndView("services");
		mv.addAllObjects(serviceData);
		
		return mv;	
	}
	@RequestMapping("/validationForm")
	String validationForm() {
		return "ticketbook";
	}
	@RequestMapping("/ticketbooking")
	ModelAndView ticketBooking(HttpServletRequest res3) {
		
		  System.out.println("entered ticketBooking loop");
		  ApplicationContext ax= new AnnotationConfigApplicationContext(SqlConfig.class); 
		  JdbcTemplate jtemplate =ax.getBean(JdbcTemplate.class);
		  List<Passenger> plist=jtemplate.query("select * from passenger",new PassengerMapper()); 
		  Map<Integer,Passenger> pMap=new HashMap<Integer, Passenger>(); 
		  for (Passenger passenger : plist) { 
		  pMap.put(passenger.getId(), passenger); 
		  }
		  Services[] serviceArray= template.
					getForEntity("http://localhost:8090/service", Services[].class).getBody();
			List<Services> serviceList=Arrays.asList(serviceArray);
			Map<Integer,Services> serviceMap=new HashMap<Integer, Services>();
			for (Services services : serviceList) {
				serviceMap.put(services.getRouteId(), services);
			}
		  int passId=Integer.parseInt(res3.getParameter("pid")); 
		  int routeNo=Integer.parseInt(res3.getParameter("rnum"));
		  int tickets=Integer.parseInt(res3.getParameter("tickets"));
		  
		  boolean checkId=pMap.get(passId) != null;
		  boolean checkRN=serviceMap.get(routeNo) != null;
		  if(checkId&&checkRN) {
			  Services route=serviceMap.get(routeNo);
			  int totalCost=tickets*route.getCost();
			  
			  ModelAndView mv=new ModelAndView("ticketgen");
			  
			  Map<String, Object> ticketInfo=new HashMap<String, Object>();
			  ticketInfo.put("pmap", pMap.get(passId));
			  ticketInfo.put("servmap", serviceMap.get(routeNo));
			  ticketInfo.put("totalpasen", tickets);
			  ticketInfo.put("totalcost", totalCost);
			  mv.addAllObjects(ticketInfo);
			  return mv;
			  
		  }
		  else {
			  ModelAndView mv=new ModelAndView("ticketfailed");
			  return mv;
		  }
			
	}
}
@Configuration
class SqlConfig{
	
	@Bean
	JdbcTemplate getjTemplate() {	
		JdbcTemplate template= new JdbcTemplate();
		template.setDataSource(datasource());
		return template;
		
	}

	private DataSource datasource() {
		
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/ibm");
		ds.setUsername("root");
		ds.setPassword("s@hi6324");
		return ds;
	}
}
