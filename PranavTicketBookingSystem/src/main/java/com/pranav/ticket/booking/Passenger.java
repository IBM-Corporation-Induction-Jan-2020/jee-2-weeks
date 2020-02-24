package com.pranav.ticket.booking;

public class Passenger {
	int id;
	String name;
	String mail;
	
	
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Passenger(String name, String mail) {
		super();
		this.name = name;
		this.mail = mail;
	}



	public Passenger(int id, String name, String mail) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
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



	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", mail=" + mail + "]";
	}
	
	
	

}
