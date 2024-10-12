package com.learnspring.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.learnspring.jdbc.model.Developer;

@SpringBootApplication
public class Lesson03SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Lesson03SpringBootJdbcApplication.class, args);
		
		Developer dev1 = context.getBean(Developer.class);
		dev1.setId(101);
		dev1.setName("Mary Jane Johnson");
		dev1.setTech("Java");
	}

}
