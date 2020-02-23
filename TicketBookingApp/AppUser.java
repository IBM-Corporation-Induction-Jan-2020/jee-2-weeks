package com.khushboo.spring.boot.ticket.booking.app;

public class AppUser {

	int id;
	String name;
	String eMail;
	
	Tickets Ticket;

	public AppUser() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AppUser(String name, String eMail) {
		super();
		this.name = name;
		this.eMail = eMail;
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

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public Tickets getTicket() {
		return Ticket;
	}

	public void setTicket(Tickets ticket) {
		Ticket = ticket;
	}

	@Override
	public String toString() {
		return "AppUser [id=" + id + ", name=" + name + ", eMail=" + eMail + ", Ticket=" + Ticket + "]";
	}
	
	
}
