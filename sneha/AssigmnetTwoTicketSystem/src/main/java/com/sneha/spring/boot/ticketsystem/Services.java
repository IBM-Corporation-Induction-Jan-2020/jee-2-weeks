package com.sneha.spring.boot.ticketsystem;

public class Services {
	
	int id;
	String route;
	int costPerSeat;
	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Services(int id, String route, int costPerSeat) {
		super();
		this.id = id;
		this.route = route;
		this.costPerSeat = costPerSeat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public int getCostPerSeat() {
		return costPerSeat;
	}
	public void setCostPerSeat(int costPerSeat) {
		this.costPerSeat = costPerSeat;
	}
	@Override
	public String toString() {
		return "Services [id=" + id + ", route=" + route + ", costPerSeat=" + costPerSeat + "]";
	}
	
}
