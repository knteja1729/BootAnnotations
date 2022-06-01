package com.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "mypackage")
public class Myconfig {
	
	@Bean
	public Student getStudent() {
		
		System.out.println("Creating Student bean Object.....");
		return new Student();
	}

}
