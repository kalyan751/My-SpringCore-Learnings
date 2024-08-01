
//part where we are dealing with the IOC container.

package in.pwskills.kalyan.config;

import java.time.LocalDateTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import in.pwskills.kalyan.bean.WishMessageGenerator;

//telling the IOC container about configuration file denoting with annotation @Configuration
@Configuration
public class AppConfig {
	static {
		System.out.println("AppConfig.class file is loading...");
	}
	
	public AppConfig() {
		System.out.println("AppConfig.wmg() :  object is created...");
	}
	
	//telling the IOC container that this is a bean please execute the bean by using @Bean
	
	@Bean(name = "wmg")
	public WishMessageGenerator wmgObj() {
		
		//creating the Target object 
		WishMessageGenerator generator = new WishMessageGenerator();
		
		//creating the dependent object 
		LocalDateTime ldt  =  LocalDateTime.now();
		
		//now we will have to link the Target object (WishMessageGenerator) and the dependent object (LocalDateTime) through setter or through constructor
		//linking
		generator.setLdt(ldt);
		
		
		return generator;
	}
	
}
