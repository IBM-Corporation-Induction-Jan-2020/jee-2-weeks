package com.khushboo.spring.boot.ticket.booking.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.khushboo.spring.boot.airport.Airport;

@Controller
public class AvailableServices {

	ArrayList<Services> service;
	
	@RequestMapping("/getServices")
	public String availableServices(HttpServletRequest req) {


		
		service = new ArrayList<Services>();
		
		service.add(new Services("Bangalore", "Chennai", "6 hrs", 500, 1111));
		service.add(new Services("Bangalore", "Hyderabad", "10 hrs", 500, 2222));
		service.add(new Services("Bangalore", "Coorg", "8 hrs", 500, 3333));
		service.add(new Services("Bangalore", "Pondicherry", "10 hrs", 500, 4444));
		service.add(new Services("Bangalore", "Chikmagalur", "6 hrs", 500, 4444));
		
		
	
		req.setAttribute("serve", service);
		return "services";
	}
	
	public List<Services> getList() {
		return service;
	}
}
