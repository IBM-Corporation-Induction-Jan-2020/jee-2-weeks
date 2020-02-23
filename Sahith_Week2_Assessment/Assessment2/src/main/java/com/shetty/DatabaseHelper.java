package com.shetty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper {
	public static Connection con;

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
		} catch (ClassNotFoundException e) {
		}

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibm", "root", "s@hi6324");
			System.out.println("connection to db is Sucessfull");
		} catch (SQLException e) {
		}

		return con;
	}
}
