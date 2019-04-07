package com.naga;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naga.bean.DepartmentBean;
import com.naga.bean.EmployeeBean;

public class SpringTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeBean bean= context.getBean("empBean", EmployeeBean.class);
		System.out.println(bean.getName());
		
		DepartmentBean dept= context.getBean("departmentBean", DepartmentBean.class);
		System.out.println(dept.getDept());
		
		
		context.close();
		
	}

}
