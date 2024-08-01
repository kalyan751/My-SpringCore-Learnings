package in.pwskills.kalyan.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.kalyan.bean.WishMessageGenerator;
import in.pwskills.kalyan.config.AppConfig;

public class TestApp {

	public static void main(String[] args) {
		//creating the object for AnnotationConfigApplicationContext(AppConfig.class)
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // where our configuration file is present ? Ans : AppConfig.class
		
		//asking the container to get the object that we created using @Bean
		WishMessageGenerator wmg = context.getBean("wmg",WishMessageGenerator.class); // get bean of name wmg and mention what type
		String status = wmg.WishMessage("sachin");
		System.out.println(status);
		
		
		//closing the container
		((AbstractApplicationContext)context).close();
		

	}

}
