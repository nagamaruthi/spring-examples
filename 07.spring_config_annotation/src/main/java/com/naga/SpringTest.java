package com.naga;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naga.bean.DepartmentBean;
import com.naga.bean.EmployeeBean;
import com.naga.config.MyConfiguration;

public class SpringTest {

	public static void main(String[] args) {

		/*
		 * ClassPathXmlApplicationContext context = new
		 * ClassPathXmlApplicationContext("beans.xml");
		 */
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(MyConfiguration.class); 
		EmployeeBean emp1= context.getBean("empBean", EmployeeBean.class);
		System.out.println(emp1);
//		EmployeeBean emp2= context.getBean("empBean", EmployeeBean.class);
//		System.out.println(emp2);
		
		
		DepartmentBean dept1= context.getBean("departmentBean", DepartmentBean.class);
//		DepartmentBean dept2= context.getBean("departmentBean", DepartmentBean.class);
		System.out.println(dept1);
//		System.out.println(dept2);
		
		
		context.close();
		
	}

}
