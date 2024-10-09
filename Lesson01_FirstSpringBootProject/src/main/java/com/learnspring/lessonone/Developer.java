package com.learnspring.lessonone;

import org.springframework.stereotype.Component;

@Component
public class Developer {
	
	Laptop lap;
	
	public void code() {
		System.out.println("I am coding...");
		lap.compile();
	}

}
