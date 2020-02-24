package com.example.demo;

import java.util.Date;

public class Ticket {
	int numberOfSeats;
	double cost;
	Date date;
	int bookingId;
	String fromCity;
	String toCity;

	int userid;
	int serviceid;

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(int numberOfSeats, float cost, Date date, int ticketId, String fromCity, String toCity, int userid,
			int serviceid) {
		super();
		this.numberOfSeats = numberOfSeats;
		this.cost = cost;
		this.date = date;
		this.bookingId = ticketId;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.userid = userid;
		this.serviceid = serviceid;
	}

	@Override
	public String toString() {
		return "Ticket [numberOfSeats=" + numberOfSeats + ", cost=" + cost + ", date=" + date + ", ticketId="
				+ bookingId + ", fromCity=" + fromCity + ", toCity=" + toCity + ", userid=" + userid + ", serviceid="
				+ serviceid + "]";
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double totalcost) {
		this.cost = totalcost;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getTicketId() {
		return bookingId;
	}

	public void setTicketId(int ticketId) {
		this.bookingId = ticketId;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getServiceid() {
		return serviceid;
	}

	public void setServiceid(int serviceid) {
		this.serviceid = serviceid;
	}

}
