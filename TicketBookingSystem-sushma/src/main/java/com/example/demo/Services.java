package com.example.demo;

public class Services {
	int id;
	String fromCity;
	String toCity;
	int avlNoOfSeats;

	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Services(int id, String fromCity, String toCity, int avlNoOfSeats) {
		super();
		this.id = id;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.avlNoOfSeats = avlNoOfSeats;
	}

	@Override
	public String toString() {
		return "Services [id=" + id + ", fromCity=" + fromCity + ", toCity=" + toCity + ", avlNoOfSeats=" + avlNoOfSeats
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getAvlNoOfSeats() {
		return avlNoOfSeats;
	}

	public void setAvlNoOfSeats(int avlNoOfSeats) {
		this.avlNoOfSeats = avlNoOfSeats;
	}

}
