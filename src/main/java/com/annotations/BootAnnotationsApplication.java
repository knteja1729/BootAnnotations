package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.annotations.config.Student;

import mypackage.Employee;

@SpringBootApplication
public class BootAnnotationsApplication implements CommandLineRunner  {
	
	@Autowired
	private Student stud;
	
	@Autowired
	private Employee emp;

	public static void main(String[] args) {
		SpringApplication.run(BootAnnotationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		stud.getMsg();
		emp.getMsg();
		
	}

}
