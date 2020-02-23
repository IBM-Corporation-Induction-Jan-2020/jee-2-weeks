package com.example.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PassengerDatabase {

	public int insertDatabase(Passenger pass) throws ClassNotFoundException, SQLException{

		Connection con = PassengerConnect.getConnect();
		int genid =0;

		PreparedStatement prepStmt = con.prepareStatement("insert into passengerdb values(?,?,?,?);",Statement.RETURN_GENERATED_KEYS);
		
		prepStmt.setInt(1, pass.getId());
		prepStmt.setString(2, pass.getName() );
		prepStmt.setString(3, pass.getMail());
		prepStmt.setString(4, pass.getTickets());
		prepStmt.execute();
		
		ResultSet rs = prepStmt.getGeneratedKeys();
		if(rs!=null && rs.next())
			 genid = rs.getInt(1);
		
		return genid;
		
	}
	
}
