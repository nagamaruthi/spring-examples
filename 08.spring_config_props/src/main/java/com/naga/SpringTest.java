package com.naga;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naga.beans.Employee;
import com.naga.config.MyConfig;

public class SpringTest {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(MyConfig.class); 
		Employee emp1= context.getBean("empBean", Employee.class);
		System.out.println(emp1.getDetails());
		
		
		context.close();
		
	}

}
