package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import dao.UserDAO;

@Configuration
@ComponentScan(basePackages="dao")
public class ApplicationContextConfig {
	
	@Bean(name="userDAO")
    public UserDAO getUserDAO(){
		return new UserDAO();
	}

}
