package com.sneha.spring.boot.ticketsystem;

public class Passenger {

	int id;
	String name;
	String mail;
	String tickets;
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passenger(String name, String mail, String tickets) {
		super();
		this.name = name;
		this.mail = mail;
		this.tickets = tickets;
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
	public String getTickets() {
		return tickets;
	}
	public void setTickets(String tickets) {
		this.tickets = tickets;
	}
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", mail=" + mail + ", tickets=" + tickets + "]";
	}
	
	
}
