package com.learnspring.mvc;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.learnspring.mvc.model.Developer;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	
	/*
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j) {
		ModelAndView mv = new ModelAndView("result");
		//mv.setViewName("result");
		
		int result = i + j;
		mv.addObject("result", result);
		
		return mv;
	}
	*/

	@ModelAttribute
	public void modelData(Model m) {
		
		m.addAttribute("name", "Developers");
		
	}
	
	@RequestMapping("/add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, ModelMap m) {
		
		int result = i + j;
		m.addAttribute("result", result);
		
		return "result";
	}
	
	@PostMapping("addDeveloper")
	public String addDeveloper(@ModelAttribute("dev1") Developer d) {
		
		List<Developer> developers = Arrays.asList(
				new Developer(101, "Mary Jane Johnson"), 
				new Developer(102, "Bruce Wayne"),
				new Developer(103, "Peter Parker"));
		
		return "result";
		
	}
	
	
	@GetMapping("getDevelopers")
	public String getDevelopers() {
		
		
		return "";
	}
	
}
