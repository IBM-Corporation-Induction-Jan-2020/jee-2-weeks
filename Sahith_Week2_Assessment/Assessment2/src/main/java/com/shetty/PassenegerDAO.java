package com.shetty;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PassenegerDAO {

	Connection con;
	int genid;
	
	public int generatedId(Passenger pass) {
		con =DatabaseHelper.getConnection();
		try { 
			  String query="insert into passenger(Name,Email) values(?,?);";
			  PreparedStatement prepStat= con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
			  prepStat.setString(1, pass.getName());
			  prepStat.setString(2, pass.getEmail()); 
	  
			  prepStat.executeUpdate();
			  
			  ResultSet rs=prepStat.getGeneratedKeys();
			 
			  if(rs != null&& rs.next()) {
				  genid=rs.getInt(1);
				  pass.setId(genid);
				  rs.close();
				  prepStat.close();
			  }
			  
		  } 
		  catch (SQLException e) {
		  System.out.println("Error uploading Data Possible SQL exception : "+e.getMessage()); 
		  }
		return genid;
		
	}
	
}
