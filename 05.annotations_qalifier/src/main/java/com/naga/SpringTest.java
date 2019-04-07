package com.naga;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naga.bean.MessageProcessingBean;

public class SpringTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beans.xml");
		
		
		/*
		 * EmployeeBean bean= context.getBean("empBean", EmployeeBean.class);
		 * System.out.println(bean.getName());
		 * 
		 * DepartmentBean dept= context.getBean("departmentBean", DepartmentBean.class);
		 * System.out.println(dept.getDept());
		 */		
		
		MessageProcessingBean messageBean= context.getBean("messageProcessing", MessageProcessingBean.class);
		
		System.out.println(messageBean.processMessage("Hello"));
		System.out.println();
		
		
		context.close();
		
	}

}
