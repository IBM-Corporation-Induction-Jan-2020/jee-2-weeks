package com.shetty;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PassengerMapper implements RowMapper<Passenger> {

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		Passenger pass=new Passenger();
		pass.setId(rs.getInt("id"));
		pass.setName(rs.getString("Name"));
		pass.setEmail(rs.getString("Email"));
		return pass;
	}

}
