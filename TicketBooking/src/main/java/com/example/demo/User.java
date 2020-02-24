package com.example.demo;

import java.util.List;

public class User {
	
	static int userid = 0;  
    { 
        userid += 1; 
    } 
    
	int id=userid;
	String name;
	String mailId;
	
	List<Integer> tickets;

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

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public List<Integer> getTickets() {
		return tickets;
	}

	public void setTickets(List<Integer> tickets) {
		tickets = tickets;
	}

	public User(String name, String mailId) {
		super();
		this.name = name;
		this.mailId = mailId;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mailId=" + mailId + ", tickets=" + tickets + "]";
	}
	
	

}
