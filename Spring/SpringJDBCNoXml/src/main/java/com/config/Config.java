package com.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {
	
	@Bean("template")
	public JdbcTemplate getJdbcTemplate() {
		DataSource dataSource = getdataSource();
		return new JdbcTemplate(dataSource);
	}
	
	@Bean("dmds")
	public DataSource getdataSource() {
		return new DriverManagerDataSource("jdbc:postgresql://localhost:5432/flm_hib", "myuser", "mypassword");
	}

}
