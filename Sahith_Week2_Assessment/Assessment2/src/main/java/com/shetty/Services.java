package com.shetty;

public class Services {

	int routeId;
	String routeDesc;
	int cost;
	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Services(int routeId, String routeDesc, int cost) {
		super();
		this.routeId = routeId;
		this.routeDesc = routeDesc;
		this.cost = cost;
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getRouteDesc() {
		return routeDesc;
	}
	public void setRouteDesc(String routeDesc) {
		this.routeDesc = routeDesc;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "services [routeId=" + routeId + ", routeDesc=" + routeDesc + ", cost=" + cost + "]";
	}
	
	  
	
	
}
