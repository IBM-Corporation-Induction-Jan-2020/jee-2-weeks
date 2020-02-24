package com.Biswajit.app.ticket;

public class Services {

	int id;
	String route;
	int routePrice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Service [id=" + id + ", route=" + route + ", routePrice=" + routePrice + "]";
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public int getRoutePrice() {
		return routePrice;
	}

	public Services(String route, int routePrice) {
		super();
		this.route = route;
		this.routePrice = routePrice;
	}

	public Services() {
		super();
	}

	public void setRoutePrice(int routePrice) {
		this.routePrice = routePrice;
	}
}
