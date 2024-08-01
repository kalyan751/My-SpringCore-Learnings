
//part where we are dealing with the IOC container.

//for constructor injection first the dependent object should be created then the target object should be created
package in.pwskills.kalyan.config;


import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pwskills.kalyan.bean.Employee;




//telling the IOC container about configuration file denoting with annotation @Configuration
@Configuration
public class AppConfig {
	static {
		System.out.println("AppConfig.class file is loading...");
	}
	
	public AppConfig() {
		System.out.println("AppConfig :  object is created...");
	}
	
	//telling the IOC container that this is a bean please execute the bean by using @Bean
	
	
	@Bean(name = "emp")
	public Object empObj() {
		
		System.out.println("AppConfig.empObj() :: Creating the object");
		
		//creating the dependent object
		List<String> friends = List.of("saurav","dravid","yuvi");
		Set<String> numbers = Set.of("9854758456","5236987589","5698745895");
		Map<String,String> accountNumbers = Map.of("Canara","1234", "SBI","5678");
		
		//creating the Target object 
		Employee employee = new Employee(10,23456.5f,friends,numbers,accountNumbers);
		return employee;
		
	}
	
	
}
