package com.shetty;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Assessment2ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Assessment2ServiceApplication.class, args);
	}
	
	@RequestMapping("/service")
	List<Services> getServices(){
		return Arrays.asList(
				new Services(111,"Bangalore -> Mangalore",2000),
				new Services(222,"Bangalore -> Chennai",3000),
				new Services(333,"Bangalore -> Pune",4000),
				new Services(444,"Bangalore -> Dharwad",1000),
				new Services(555,"Bangalore -> Kerala",2500)
				);
	}

}
