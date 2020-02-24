package com.example.demo;

public class TicketID {
	
	static int genid = 499;  
    { 
        genid += 1; 
    } 
    
	int userId;
	int ticketId=genid;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	@Override
	public String toString() {
		return "TicketID [userId=" + userId + ", ticketId=" + ticketId + "]";
	}
	public TicketID() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TicketID(int userId, int ticketId) {
		super();
		this.userId = userId;
		this.ticketId = ticketId;
	}

}
