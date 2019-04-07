package com.naga.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DepartmentBean {

	public String getDept() {
		
		return "From dept bean";
	}
	
	@PostConstruct
	public void initialization() {
		System.out.println(">>In initialization of Department");
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println(">>In cleanup of Department...will not be called at akk");
	}
//In prototype mode, pre destroy will not be called by Spring container. You need to write your own cleanup logic..
}
