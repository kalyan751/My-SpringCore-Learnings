
//part where we are dealing with the IOC container.

//for constructor injection first the dependent object should be created then the target object should be created
package in.pwskills.kalyan.config;





import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;




@Configuration
@ComponentScan(basePackages = "in.pwskills.kalyan")
@PropertySource("application.properties")
public class AppConfig { 
	static {
		System.out.println("AppConfig.class file is loading...");
	}
	
	public AppConfig() {
		System.out.println("AppConfig :  object is created...");
	}
	
	/*  injecting the Environment //Environment will be automatically binded using @Autowired because 
	 *  we need not create a object using @Bean this time because Environment object is present in the IONC conrtainer
	 */
	@Autowired
	private Environment environmet;
	
	
	//asking the IOC container to create a object of the Datrasource
	@Bean(name = "dataSource")
	public DataSource dataSource() {
		
		//1 creating the object of the  DriverManagerDataSource
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		//2 suppy the values url, user,password form the .properties file 
		dataSource.setUrl(environmet.getProperty("info.mysql.url"));
		dataSource.setUsername(environmet.getProperty("info.mysql.user"));
		dataSource.setPassword(environmet.getProperty("info.mysql.password"));
		
		
		
		
		
		
		return dataSource;
	}
	
	
	

		
	}
	
	

