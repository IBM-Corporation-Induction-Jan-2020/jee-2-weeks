package com.example.demo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public class AccessSqlDatapassenger {

	// Method to insert passenger details
	public long insertData(String userName, String mailId) {

		KeyHolder keyHolder = new GeneratedKeyHolder();
		ApplicationContext ac = new AnnotationConfigApplicationContext(SQLConfig.class);
		JdbcTemplate jtemplate = ac.getBean(JdbcTemplate.class);

		Object[] params = new Object[] { userName, mailId };
		String sql = "INSERT INTO passenger(name,mailid) VALUES (?, ?);";
		Connection con;
		jtemplate.update(connection -> {
			PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, userName);
			ps.setString(2, mailId);
			return ps;
		}, keyHolder);
		System.out.println("Passenger Data inserted successfully!!!");

		return (long) keyHolder.getKey();

	}

	// method to retrieve services details from mysql
	public List<Service> retriveData() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(SQLConfig.class);
		JdbcTemplate jtemplate = ac.getBean(JdbcTemplate.class);
		List<Service> serviceList = jtemplate.query("select * from services", new ServiceMapper());

		System.out.println("Service Data retrieved successfully!!!!!!!");
		return serviceList;
	}

	// method to to insert ticket details to database
	public Ticket ticketBooking(String userId, String serviceId, String noOfSeats, String string, Ticket ticket)
			throws ParseException {
		double perSeatCost;
		String toCity;
		String fromCity;
		double totalcost;
		Connection con;

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		java.util.Date date = dateFormat.parse(string);
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());

		KeyHolder keyHolder = new GeneratedKeyHolder();

		ApplicationContext ac = new AnnotationConfigApplicationContext(SQLConfig.class);
		JdbcTemplate jtemplate = ac.getBean(JdbcTemplate.class);

		Object[] parameters = new Object[] { Integer.parseInt(userId) };
		String sql = "SELECT count(*) FROM passenger WHERE id = ?";
		int UserCount = jtemplate.queryForObject(sql, parameters, Integer.class);

		Object[] parameters1 = new Object[] { Integer.parseInt(serviceId) };
		String sql1 = "SELECT count(*) FROM services WHERE service_id = ?";
		int serviceCount = jtemplate.queryForObject(sql, parameters1, Integer.class);

		if (UserCount == 0) {
			System.out.println("user does not exists");
		} else if (serviceCount > 0) {
			System.out.println("Service does not exists");
		} else {
			String insertSql = "INSERT INTO tickets(user_id,service_id, no_of_seats, total_cost, date) VALUES (?,?,?,?,?);";
			Object[] params = new Object[] { Integer.parseInt(serviceId) };
			
			toCity = jtemplate.queryForObject("select to_city from services where service_id=? ", params, String.class);
			fromCity = jtemplate.queryForObject("select from_city from services where service_id=? ", params,
					String.class);
			perSeatCost = jtemplate.queryForObject("select cost_per_seat from services where service_id=? ", params,
					Integer.class);

			totalcost = Integer.parseInt(noOfSeats) * perSeatCost;

			jtemplate.update(connection -> {
				PreparedStatement ps = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);
				ps.setInt(1, Integer.parseInt(userId));
				ps.setInt(2, Integer.parseInt(serviceId));
				ps.setInt(3, Integer.parseInt(noOfSeats));
				ps.setDouble(4, totalcost);
				ps.setDate(5, sqlDate);
				return ps;
			}, keyHolder);
			System.out.println("Ticket Data inserted successfullyyy");

			ticket.setUserid(Integer.parseInt(userId));
			ticket.setCost(totalcost);
			ticket.setServiceid(Integer.parseInt(serviceId));
			ticket.setTicketId(keyHolder.getKey().intValue());
			ticket.setUserid(Integer.parseInt(userId));
			ticket.setDate(date);
			ticket.setNumberOfSeats(Integer.parseInt(noOfSeats));
			ticket.setFromCity(fromCity);
			ticket.setToCity(toCity);

			return ticket;
		}
		return ticket;

	}

	public List<Ticket> getUserTickets(String userId) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(SQLConfig.class);
		JdbcTemplate jtemplate = ac.getBean(JdbcTemplate.class);
		Object[] params = new Object[] { userId };

		List<Ticket> tickets = jtemplate.query("select * from tickets where user_id=?", params,
				new RowMapper<Ticket>() {
					@Override
					public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {
						Ticket ticket = new Ticket();
						ticket.setUserid(rs.getInt("user_id"));
						ticket.setServiceid(rs.getInt("service_id"));
						ticket.setTicketId(rs.getInt("booking_id"));
						ticket.setNumberOfSeats(rs.getInt(" no_of_seats"));
						ticket.setCost(rs.getDouble("total_cost"));
						ticket.setDate(rs.getDate("date"));

						return ticket;

					}
				});
		return tickets;
	}

}

@Configuration
class SQLConfig {
	@Bean
	JdbcTemplate getJTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(dataSource());

		return template;
	}

	private DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/ibm");
		ds.setUsername("root");
		ds.setPassword("sushma");

		return ds;
	}
}
