package com.example.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {

	public int insertDatabse(Passenger pass) {
		Connection con;
		int genid =0;
		try {
			con = DatabaseHelper.getconnect();
			PreparedStatement pstm = con.prepareStatement("insert into passengercc values(? ,?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			
			pstm.setInt(1, pass.getId());
			pstm.setString(2, pass.getName());
			pstm.setString(3, pass.getMail());
			pstm.setString(4, pass.getTickets());
			pstm.execute();	
			
			ResultSet rs = pstm.getGeneratedKeys();
			if(rs!=null && rs.next())
				 genid = rs.getInt(1);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return genid;
		
			
	}
	
	public Passenger getbody(int count) {
		Connection con;
		Passenger passm = new Passenger();

		try {
			con = DatabaseHelper.getconnect();
			Statement pstm = con.createStatement();
			
			ResultSet result = pstm.executeQuery("select *from  passengercc where id="+count);
			
			while(result.next()) {
			passm.setId(result.getInt("id"));
			passm.setName(result.getString("name"));
			passm.setMail(result.getString("mail"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		}
	
		return passm;
		
	}
	
//	public String getvalidate(String id) {
//		Connection con;
//		Passenger passm = new Passenger();
//		boolean val =false;
//		try {
//			con = DatabaseHelper.getconnect();
//			Statement pstm = con.createStatement();
//			
//			ResultSet result = pstm.executeQuery("select *from  passengercc");
//			
//			while(result.next()) {
//				if(id==result.getString("name")) {
//					val = true;
//					break;
//				}
//			
//			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		
//		
//		}
//	
//		return id;
//		
//	}
//	
}
