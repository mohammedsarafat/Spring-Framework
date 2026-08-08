package com.nit;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.nit")
@PropertySource("classpath:application.properties")
public class OperationConfig {

	@Autowired
	private Environment environment;

	@Bean
	public DataSource dataSource() {

		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverClassName(environment.getProperty("db.driverName"));

		ds.setUrl(environment.getProperty("db.url"));

		ds.setUsername(environment.getProperty("db.username"));

		ds.setPassword(environment.getProperty("db.password"));

		return ds;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {

		return new JdbcTemplate(dataSource());
	}
}
