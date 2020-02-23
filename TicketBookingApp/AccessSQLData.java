package com.khushboo.spring.boot.ticket.booking.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class AccessSQLData {

	static ApplicationContext ax = new AnnotationConfigApplicationContext(SQLConfig.class);
	static JdbcTemplate jTemplate = ax.getBean(JdbcTemplate.class);

	public static int getID(String name, String mail) {

		int genId = (int) (Math.random() * 1000);

		int row = jTemplate.update("insert into appuser(id, name, email) values(?,?,?)", genId, name, mail);

		return genId;
	}

	public static boolean validateID(String userID) {

		int count = jTemplate.queryForObject("Select count(*) from appuser where id=?", new Object[] { userID },
				Integer.class);
		if (count>0)
			return true;
		else
			return false;
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
		ds.setPassword("Khushi992821");

		return ds;
	}
}