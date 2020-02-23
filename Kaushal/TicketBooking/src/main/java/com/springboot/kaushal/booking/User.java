package com.springboot.kaushal.booking;

public class User {
	private String id;
	private String name;
	private String email;
	private String ticket_number;
	private String source;
	private String destination;
	private String price;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", ticket_number=" + ticket_number + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getTicket_number() {
		return ticket_number;
	}

	public void setTicket_number(String ticket_number) {
		this.ticket_number = ticket_number;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
