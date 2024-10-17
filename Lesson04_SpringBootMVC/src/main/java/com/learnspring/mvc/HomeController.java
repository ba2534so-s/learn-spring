package com.learnspring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j) {
		ModelAndView mv = new ModelAndView("result");
		//mv.setViewName("result");
		
		int result = i + j;
		mv.addObject("result", result);
		
		return mv;
	}

}
