package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper {
	
	
public static Connection getconnect() throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("Driver is Loaded");
		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ibm" , "root","AniketGupta2210");

			System.out.println("Connection to DB is succesfull");
			return con;
	}
	

}
