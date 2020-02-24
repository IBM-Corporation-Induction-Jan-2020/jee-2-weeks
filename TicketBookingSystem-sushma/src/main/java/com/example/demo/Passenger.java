package com.example.demo;

public class Passenger {
	int id;
	String name;
	String mail;
	Ticket tickets;

	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passenger(String name, String mail, Ticket tickets) {
		super();
		this.name = name;
		this.mail = mail;
		this.tickets = tickets;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", mail=" + mail + ", tickets=" + tickets + "]";
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Ticket getTickets() {
		return tickets;
	}

	public void setTickets(Ticket tickets) {
		this.tickets = tickets;
	}

}
