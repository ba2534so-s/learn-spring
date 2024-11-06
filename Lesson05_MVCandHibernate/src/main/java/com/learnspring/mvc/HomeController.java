package com.learnspring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learnspring.mvc.model.Developer;

@Controller
public class HomeController {
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Developers");
	}
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	
	@PostMapping("addDeveloper")
	public String addDeveloper(@ModelAttribute("dev1") Developer d) {
		return "result";
		
	}
	
	public String getDevelopers(Model m) {
		
	}
}
