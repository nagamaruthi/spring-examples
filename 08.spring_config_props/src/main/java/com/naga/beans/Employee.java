package com.naga.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("empBean")
public class Employee {

	@Value("${applicaiton.name}")
	private String name;
	@Value("${application.mail}")
	private String mail;
	
	public String getDetails() {
		return "Applicaiton name is >>: "+name+
				" email is :>> "+mail;
	}
}
