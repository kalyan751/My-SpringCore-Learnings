
//part where we are dealing with the IOC container.

//for constructor injection first the dependent object should be created then the target object should be created
package in.pwskills.kalyan.config;




import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



@Configuration
@ComponentScan(basePackages = "in.pwskills.kalyan")
//@PropertySource("application.properties")
public class AppConfig { 
	static {
		System.out.println("AppConfig.class file is loading...");
	}
	
	public AppConfig() {
		System.out.println("AppConfig :  object is created...");
	}
	
	@Autowired
	private Environment environment;
	
	@Bean(value = "ds")
	public DataSource getDataSource() {
		
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setUrl(environment.getProperty("info.mysql1.url"));
		dataSource.setUsername(environment.getProperty("info.mysql1.username"));
		dataSource.setPassword(environment.getProperty("info.mysql1.password"));
		return dataSource;
	}

	

		
	}
	
	

