package com.springboot.kaushal.booking;

import java.sql.*;
public class DatabaseCon {

    public Connection createcon() throws Exception{
    	Connection con=DriverManager.getConnection(  
    			"jdbc:mysql://localhost:3306/kaushal","root","root123");
    	return con;
    }
}
