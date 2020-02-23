package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PassengerConnect {

	public static Connection getConnect() throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver is loaded");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ibm", "root", "Anup@1998p");
		System.out.println("connection to DB is successful");
		
		return con;
		
	}
}
