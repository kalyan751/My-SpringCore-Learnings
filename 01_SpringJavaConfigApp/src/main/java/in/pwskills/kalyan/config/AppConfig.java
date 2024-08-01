package in.pwskills.kalyan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pwskills.kalyan.bean.Employee;

//telling the IOC container that this is a configuration file denoting with annotation @Configuration
@Configuration
public class AppConfig {
	static {
		System.out.println("AppConfig.class file is loading...");
	}
	
	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}
	
	//telling the IOC container that this is a bean please execute the bean by using @Bean
	//giving some name for the bean and using that name instead for the method name
	@Bean(name = "emp")
	public Employee empObj() {
		Employee employee =  new Employee();
		employee.setEid(10);
		employee.setEname("Sachin");
		employee.setEage(52);
		employee.setEaddress("MI");
		return employee;
	}
	
}
