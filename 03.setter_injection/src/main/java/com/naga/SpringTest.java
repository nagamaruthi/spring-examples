package com.naga;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naga.service.EmployeeService;

public class SpringTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		EmployeeService service = context.getBean("emp", EmployeeService.class);
		System.out.println(service.getData());
		context.close();
	}

}
