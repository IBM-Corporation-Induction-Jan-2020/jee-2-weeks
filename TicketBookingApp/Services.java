package com.khushboo.spring.boot.ticket.booking.app;

public class Services {

	String source;
	String destination;

	String duration;
	int cost;
	int serviceID;

	public Services(String source, String destination, String duration, int cost, int serviceID) {
		super();
		this.source = source;
		this.destination = destination;
		this.duration = duration;
		this.cost = cost;
		this.serviceID = serviceID;
	}

	public Services() {
		super();
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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getServiceID() {
		return serviceID;
	}

	public void setServiceID(int serviceID) {
		this.serviceID = serviceID;
	}

	@Override
	public String toString() {
		return "Services [source=" + source + ", destination=" + destination + ", duration=" + duration + ", cost="
				+ cost + ", serviceID=" + serviceID + "]";
	}

}
