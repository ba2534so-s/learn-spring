package com.learnspring.mvc;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	
	public void home() {
		System.out.println("Home page requested");
	}

}
