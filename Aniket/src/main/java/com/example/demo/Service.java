package com.example.demo;

public class Service {

	int id;
	String train;
	String time;
	int cost;

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Service(int id, String train, String time, int cost) {
		super();
		this.id = id;
		this.train = train;
		this.time = time;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTrain() {
		return train;
	}

	public void setTrain(String train) {
		this.train = train;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Service [id=" + id + ", train=" + train + ", time=" + time + ", cost=" + cost + "]";
	}

}
