package com.spring.datasource;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;


@Configuration
@Component
@Scope("singleton")
public class DataSourceImple  {

	private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/testDemo";
    private static final String USER = "root";
    private static final String PASS = "";

	
public static DataSource getDataSource()  {
	
    BasicDataSource dataSource = new BasicDataSource();

    dataSource.setDriverClassName(DRIVER_CLASS_NAME);
    dataSource.setUrl(URL);
    dataSource.setUsername(USER);
    dataSource.setPassword(PASS);
    return dataSource;
    
}

}