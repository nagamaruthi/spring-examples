package com.naga.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("empBean")
@Scope("singleton")
public class EmployeeBean {

	public String getName() {
		
		return "Naga";
	}
	
	
	@PostConstruct
	public void initialization() {
		System.out.println(">>In initialization of Employee");
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println(">>In cleanup of Employee");
	}
	
}
