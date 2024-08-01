package in.pwskills.kalyan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.kalyan.bean.WishMessageGenerator;
import in.pwskills.kalyan.config.AppConfig;

public class TestApp {

	public static void main(String[] args) {
		//creating the object for AnnotationConfigApplicationContext(AppConfig.class)
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // where our configuration file is present ? Ans : AppConfig.class
		
		//asking the container to get the object that we created using the @bean
		
		WishMessageGenerator generator = context.getBean("wmg",WishMessageGenerator.class);
		String status = generator.WishMessage("Kalyan");
		System.out.println(status);
		
		//closing the container
		((AbstractApplicationContext)context).close();
		

	}

}
