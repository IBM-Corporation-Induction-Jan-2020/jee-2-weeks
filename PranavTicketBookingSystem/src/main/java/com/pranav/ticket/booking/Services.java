package com.pranav.ticket.booking;

public class Services {
	
	int id;
	String src;
	String dest;
	int cost;
	
	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Services(int id, String src, String dest, int cost) {
		super();
		this.id = id;
		this.src = src;
		this.dest = dest;
		this.cost = cost;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSrc() {
		return src;
	}


	public void setSrc(String src) {
		this.src = src;
	}


	public String getDest() {
		return dest;
	}


	public void setDest(String dest) {
		this.dest = dest;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	@Override
	public String toString() {
		return "Services [id=" + id + ", src=" + src + ", dest=" + dest + ", cost=" + cost + "]";
	}

	
	

}
