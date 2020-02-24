package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PassengerMapper implements RowMapper<Passenger> {

	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		Passenger passenger = new Passenger();
		passenger.setName(rs.getString("name"));
		passenger.setMail(rs.getString("mailid"));

		return passenger;
	}

}
