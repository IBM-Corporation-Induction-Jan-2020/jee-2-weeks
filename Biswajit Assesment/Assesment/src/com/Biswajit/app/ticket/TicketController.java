package com.Biswajit.app.ticket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TicketController {
	static HashMap<Integer, Services> hmTicket = new HashMap<>();
	static HashMap<Integer, Passenger> hmPassenger = new HashMap<Integer, Passenger>();
	boolean servicesInitialized = false;
	static List<Integer> idList = new ArrayList<Integer>();

	@RequestMapping("/createPassenger")
	String createPassenger() {
		System.out.println("Would like to create passenger!!");

		return ("passenger");
	}

	@RequestMapping("/viewServices")
	ModelAndView viewServices() {
		System.out.println("Would like to show all services!!");
		if (servicesInitialized == false)
			services();
		int i = 1;
		ModelAndView mv = new ModelAndView("services");

		Map<String, Object> dataMap = new HashMap<String, Object>();
		Iterator hmIterator = hmTicket.entrySet().iterator();

		while (hmIterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry) hmIterator.next();
			dataMap.put("Service" + i, mapElement.getValue());
			i++;
		}

		mv.addAllObjects(dataMap);
		return mv;
	}

	@RequestMapping("/bookTickets")
	String bookTickets() {

		System.out.println("Would like to book tickets!!");
		return ("tickets");
	}

	@RequestMapping(value = "newPassenger", method = RequestMethod.POST)
	ModelAndView createNewPassenger(HttpServletRequest req) {

		String name = req.getParameter("pname");
		String mail = req.getParameter("pmail");

		Passenger pas = new Passenger();
		pas.setName(name);
		pas.setMail(mail);
		pas.setId((int) (Math.random() * 1000));

		System.out.println(pas.getName());
		System.out.println(pas.getId());
		System.out.println(pas.getMail());

		insertData(pas);

		ModelAndView mv = new ModelAndView("passengerSuccess");

		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("pid", pas.getId());
		dataMap.put("pname", pas.getName());
		dataMap.put("pmail", pas.getMail());
		mv.addAllObjects(dataMap);
		return mv;
	}

	@RequestMapping(value = "newTicket", method = RequestMethod.POST)
	ModelAndView bookNewTicket(HttpServletRequest req) {
		int pID = Integer.parseInt(req.getParameter("pID"));
		int serviceID = Integer.parseInt(req.getParameter("serviceID"));
		int count = Integer.parseInt(req.getParameter("count"));
		ModelAndView mv = null;
		if (getIdSQL(pID)) {
			if (hmTicket.containsKey(serviceID)) {
				Passenger pas = hmPassenger.get(pID);
				Services service = hmTicket.get(serviceID);

				mv = new ModelAndView("ticketSuccess");
				Map<String, Object> dataMap = new HashMap<String, Object>();

				dataMap.put("pID", pas.getId());
				dataMap.put("pName", pas.getName());
				dataMap.put("pMail", pas.getMail());
				dataMap.put("serviceID", service.getId());
				dataMap.put("sRoute", service.getRoute());
				dataMap.put("rPrice", service.getRoutePrice());
				dataMap.put("count", count);
				dataMap.put("tPrice", service.getRoutePrice() * count);
				mv.addAllObjects(dataMap);

			}
		} else
			mv = new ModelAndView("ticketFailure");

		return mv;

	}

	void services() {

		Services firstService = new Services("Bangalore To Hyderabad", 480);
		firstService.setId((int) (Math.random() * 1000));

		Services secondService = new Services("Hyderabad To Bangalore", 490);
		secondService.setId((int) (Math.random() * 1000));

		Services thirdService = new Services("Bangalore To Tatanagar", 970);
		thirdService.setId((int) (Math.random() * 1000));

		Services fourthService = new Services("Tatanagar To Hyderabad", 740);
		fourthService.setId((int) (Math.random() * 1000));

		Services fifthService = new Services("Hyderabad To Mumbai", 890);
		fifthService.setId((int) (Math.random() * 1000));

		hmTicket.put(firstService.getId(), fifthService);
		hmTicket.put(secondService.getId(), secondService);
		hmTicket.put(thirdService.getId(), thirdService);
		hmTicket.put(fourthService.getId(), fourthService);
		hmTicket.put(fifthService.getId(), fifthService);

		servicesInitialized = true;

	}

	void insertData(Passenger pas) {

		ApplicationContext ax = new AnnotationConfigApplicationContext(SQLConfig.class);
		JdbcTemplate jTemplate = ax.getBean(JdbcTemplate.class);

		jTemplate.execute(
				"insert into passengers values(" + pas.getId() + ",'" + pas.getName() + "','" + pas.getMail() + "')");

	}

	boolean getIdSQL(int pID) {
		ApplicationContext ax = new AnnotationConfigApplicationContext(SQLConfig.class);
		JdbcTemplate jTemplate = ax.getBean(JdbcTemplate.class);

		List<Passenger> pList = jTemplate.query("select * from passengers", new PassengerMapper());

		for (Passenger passenger : pList) {
			hmPassenger.put(passenger.getId(), passenger);
		}

		if (hmPassenger.containsKey(pID))
			return true;

		else
			return false;

	}
}

@Configuration
class SQLConfig {

	@Bean
	JdbcTemplate getJTemplate() {
		JdbcTemplate template = new JdbcTemplate();

		template.setDataSource(dataSource());
		return template;

	}

	private DataSource dataSource() {

		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/ibm");
		ds.setUsername("root");
		ds.setPassword("3102");

		return ds;
	}
}