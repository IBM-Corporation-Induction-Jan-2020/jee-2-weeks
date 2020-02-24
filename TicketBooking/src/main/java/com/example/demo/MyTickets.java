package com.example.demo;

public class MyTickets {
	
	int bookingId;
	String user;
	int ser1=0;
	int ser2=0;
	int ser3=0;
	int ser4=0;
	int ser5=0;
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getSer1() {
		return ser1;
	}
	public void setSer1(int ser1) {
		this.ser1 = ser1;
	}
	public int getSer2() {
		return ser2;
	}
	public void setSer2(int ser2) {
		this.ser2 = ser2;
	}
	public int getSer3() {
		return ser3;
	}
	public void setSer3(int ser3) {
		this.ser3 = ser3;
	}
	public int getSer4() {
		return ser4;
	}
	public void setSer4(int ser4) {
		this.ser4 = ser4;
	}
	public int getSer5() {
		return ser5;
	}
	public void setSer5(int ser5) {
		this.ser5 = ser5;
	}
	@Override
	public String toString() {
		return "MyTickets [bookingId=" + bookingId + ", user=" + user + ", ser1=" + ser1 + ", ser2=" + ser2 + ", ser3="
				+ ser3 + ", ser4=" + ser4 + ", ser5=" + ser5 + "]";
	}
	public MyTickets() {
		super();

	}
	public MyTickets(int bookingId, String user, int ser1, int ser2, int ser3, int ser4, int ser5) {
		super();
		this.bookingId = bookingId;
		this.user = user;
		this.ser1 = ser1;
		this.ser2 = ser2;
		this.ser3 = ser3;
		this.ser4 = ser4;
		this.ser5 = ser5;
	}
	
	

}
