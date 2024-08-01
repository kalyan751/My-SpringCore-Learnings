package in.pwskills.kalyan.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.kalyan.bean.Employee;
import in.pwskills.kalyan.config.AppConfig;

public class TestApp {

	public static void main(String[] args) {
		//creating the object for AnnotationConfigApplicationContext(AppConfig.class)
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // where our configuration file is present ? Ans : AppConfig.class
		
		//asking the container to get the object that we created using @Bean
		//Employee employee = context.getBean("empObj",Employee.class);
		//instead of using the method name using the name that we specified for the bean
		Employee employee = context.getBean("emp",Employee.class);
		
		System.out.println(employee);
		
		//closing the container
		((AbstractApplicationContext)context).close();
		

	}

}
