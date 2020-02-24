package com.example.demo;

public class Service {
	int serviceId;
	String fromCity;
	String toCity;

	double cost;
	int noOfAvailableSeats;

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Service(int serviceId, String fromCity, String toCity, double cost, int noOfAvailableSeats) {
		super();
		this.serviceId = serviceId;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.cost = cost;
		this.noOfAvailableSeats = noOfAvailableSeats;
	}

	@Override
	public String toString() {
		return "Service [serviceId=" + serviceId + ", fromCity=" + fromCity + ", toCity=" + toCity + ", cost=" + cost
				+ ", noOfAvailableSeats=" + noOfAvailableSeats + "]";
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
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

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getNoOfAvailableSeats() {
		return noOfAvailableSeats;
	}

	public void setNoOfAvailableSeats(int noOfAvailableSeats) {
		this.noOfAvailableSeats = noOfAvailableSeats;
	}

}
