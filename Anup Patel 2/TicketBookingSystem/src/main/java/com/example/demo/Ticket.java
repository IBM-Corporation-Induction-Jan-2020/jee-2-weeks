package com.example.demo;

public class Ticket {
	String tname;
	String astation;
	String dstation;
	int quant;
	float cost;
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(String tname, String astation, String dstation, int quant, float cost) {
		super();
		this.tname = tname;
		this.astation = astation;
		this.dstation = dstation;
		this.quant = quant;
		this.cost = cost;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getAstation() {
		return astation;
	}
	public void setAstation(String astation) {
		this.astation = astation;
	}
	public String getDstation() {
		return dstation;
	}
	public void setDstation(String dstation) {
		this.dstation = dstation;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Ticket [tname=" + tname + ", astation=" + astation + ", dstation=" + dstation + ", quant=" + quant
				+ ", cost=" + cost + "]";
	}
	
	
}
