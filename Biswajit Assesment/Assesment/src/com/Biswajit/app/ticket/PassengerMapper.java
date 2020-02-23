package com.Biswajit.app.ticket;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PassengerMapper implements RowMapper<Passenger> {

	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {

		Passenger pas = new Passenger();
		pas.setId(rs.getInt(1));
		pas.setName(rs.getString(2));
		pas.setMail(rs.getString(3));

		return pas;
	}

}
