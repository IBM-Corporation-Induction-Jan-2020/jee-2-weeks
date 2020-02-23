package com.shetty;

public class Passenger {

	int id;
	String name;
	String email;
	int ticketid;
	
	
	public Passenger(String name, String email, int ticketid) {
		super();
		this.name = name;
		this.email = email;
		this.ticketid = ticketid;
	}
	
	public Passenger(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", email=" + email + ", ticketid=" + ticketid + "]";
	}
	
	
	
}
