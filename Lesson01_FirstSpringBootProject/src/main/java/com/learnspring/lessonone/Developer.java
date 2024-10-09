package com.learnspring.lessonone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Developer {
	
	@Autowired
	Laptop lap;
	
	public void code() {
		System.out.println("I am coding...");
		lap.compile();
	}

}
