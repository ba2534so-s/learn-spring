package com.learnspring.lessonone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lesson01FirstSpringBootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Lesson01FirstSpringBootProjectApplication.class, args);
		
		Developer obj = context.getBean(Developer.class);
		
		
	}

}
