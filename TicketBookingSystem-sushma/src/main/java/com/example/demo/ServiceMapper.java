package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ServiceMapper implements RowMapper<Service> {

	@Override
	public Service mapRow(ResultSet rs, int rowNum) throws SQLException {
		Service service = new Service();
		service.setServiceId(rs.getInt("service_id"));
		service.setFromCity(rs.getString("from_city"));
		service.setToCity(rs.getString("to_city"));
		service.setCost(rs.getDouble("cost_per_seat"));
		service.setNoOfAvailableSeats(rs.getInt("no_of_available_seats"));
		return service;
	}

}
