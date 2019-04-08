package com.naga.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.naga")
@PropertySource("classpath:myapp.properties")
public class MyConfig {
	
	

}
