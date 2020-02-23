package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class Ticket {

	int cost = 0;
	
	void list(){
		Service tickets = new Service();
		List<Service> list = new ArrayList<Service>();
		list.add(new Service(1,"Bangalore-Chennai","6hrs",1200));
		list.add(new Service(2,"Delhi-Shimla","8hrs",3000));
		list.add(new Service(3,"Delhi-Chandigarh","4hrs",500));
		list.add(new Service(4,"Chandigarh-Shimla","3hrs",1800));
		list.add(new Service(5,"Bangalore-Mumbai","12hrs",5600));
	}
	

	public void details(Passenger pasn) {

		System.out.println(pasn);
	}


	public String gen1(HttpServletRequest req,String ticketId,String count, Passenger pasn) {
		
		Service tickets = new Service();
		List<Service> lists = new ArrayList<Service>();
		lists.add(new Service(1,"Bangalore-Chennai","6hrs",1200));
		lists.add(new Service(2,"Delhi-Shimla","8hrs",3000));
		lists.add(new Service(3,"Delhi-Chandigarh","4hrs",500));
		lists.add(new Service(4,"Chandigarh-Shimla","3hrs",1800));
		lists.add(new Service(5,"Bangalore-Mumbai","12hrs",5600));
		
		int con=Integer.parseInt(count);
		int id=Integer.parseInt(ticketId);
		
			cost=1200*con;
			req.setAttribute("pq", pasn);
			System.out.println(lists.get(0));
			Service po = lists.get(0);
			req.setAttribute("li", po);
			req.setAttribute("cost", cost);

			System.out.println(lists);
		return "fetchticket"+ticketId;
		
	}


	public String gen2(HttpServletRequest req, String ticketId, String count, Passenger pasn) {

		Service tickets = new Service();
		List<Service> lists = new ArrayList<Service>();
		lists.add(new Service(1,"Bangalore-Chennai","6hrs",1200));
		lists.add(new Service(2,"Delhi-Shimla","8hrs",3000));
		lists.add(new Service(3,"Delhi-Chandigarh","4hrs",500));
		lists.add(new Service(4,"Chandigarh-Shimla","3hrs",1800));
		lists.add(new Service(5,"Bangalore-Mumbai","12hrs",5600));
		
		int con=Integer.parseInt(count);
		int id=Integer.parseInt(ticketId);
		
			cost=3000*con;
			req.setAttribute("pq", pasn);
			System.out.println(lists.get(1));
			Service po = lists.get(1);
			req.setAttribute("li", po);
			req.setAttribute("cost", cost);

			System.out.println(lists);
		return "fetchticket"+ticketId;
	}


	public String gen3(HttpServletRequest req, String ticketId, String count, Passenger pasn) {
		Service tickets = new Service();
		List<Service> lists = new ArrayList<Service>();
		lists.add(new Service(1,"Bangalore-Chennai","6hrs",1200));
		lists.add(new Service(2,"Delhi-Shimla","8hrs",3000));
		lists.add(new Service(3,"Delhi-Chandigarh","4hrs",500));
		lists.add(new Service(4,"Chandigarh-Shimla","3hrs",1800));
		lists.add(new Service(5,"Bangalore-Mumbai","12hrs",5600));
		
		int con=Integer.parseInt(count);
		int id=Integer.parseInt(ticketId);
		
			cost=500*con;
			req.setAttribute("pq", pasn);
			System.out.println(lists.get(2));
			Service po = lists.get(2);
			req.setAttribute("li", po);
			req.setAttribute("cost", cost);

			System.out.println(lists);
		return "fetchticket"+ticketId;		
	}


	public String gen4(HttpServletRequest req, String ticketId, String count, Passenger pasn) {
		Service tickets = new Service();
		List<Service> lists = new ArrayList<Service>();
		lists.add(new Service(1,"Bangalore-Chennai","6hrs",1200));
		lists.add(new Service(2,"Delhi-Shimla","8hrs",3000));
		lists.add(new Service(3,"Delhi-Chandigarh","4hrs",500));
		lists.add(new Service(4,"Chandigarh-Shimla","3hrs",1800));
		lists.add(new Service(5,"Bangalore-Mumbai","12hrs",5600));
		
		int con=Integer.parseInt(count);
		int id=Integer.parseInt(ticketId);
		
			cost=1800*con;
			req.setAttribute("pq", pasn);
			System.out.println(lists.get(3));
			Service po = lists.get(3);
			req.setAttribute("li", po);
			req.setAttribute("cost", cost);

			System.out.println(lists);
		return "fetchticket"+ticketId;		
	}


	public String gen5(HttpServletRequest req, String ticketId, String count, Passenger pasn) {
		Service tickets = new Service();
		List<Service> lists = new ArrayList<Service>();
		lists.add(new Service(1,"Bangalore-Chennai","6hrs",1200));
		lists.add(new Service(2,"Delhi-Shimla","8hrs",3000));
		lists.add(new Service(3,"Delhi-Chandigarh","4hrs",500));
		lists.add(new Service(4,"Chandigarh-Shimla","3hrs",1800));
		lists.add(new Service(5,"Bangalore-Mumbai","12hrs",5600));
		
		int con=Integer.parseInt(count);
		int id=Integer.parseInt(ticketId);
		
			cost=5600*con;
			req.setAttribute("pq", pasn);
			System.out.println(lists.get(4));
			Service po = lists.get(4);
			req.setAttribute("li", po);
			req.setAttribute("cost", cost);

			System.out.println(lists);
		return "fetchticket"+ticketId;		
	}
	
}
