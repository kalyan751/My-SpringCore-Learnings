package in.pwskills.kalyan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import in.pwskills.kalyan.config.AppConfig;
import in.pwskills.kalyan.dao.EmployeeMySQL1DaoImpl;

public class TestApp {

	public static void main(String[] args) {
		//creating the object for AnnotationConfigApplicationContext(AppConfig.class)
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // where our configuration file is present ? Ans : AppConfig.class
		
		//asking the container to get the names of the beans
		String[] definitionNames = context.getBeanDefinitionNames();
		
		//System.out.println(definitionNames);
		
		for(String beanName : definitionNames) {
			System.out.println(beanName);
		}
		
		
		//getting the Target Object 
		 EmployeeMySQL1DaoImpl daoImpl = context.getBean("MySqlDao1",EmployeeMySQL1DaoImpl.class);
		 daoImpl.getConnection();
		 System.out.println();
		
		//closing the container
		((AbstractApplicationContext)context).close();
		

	}

}
