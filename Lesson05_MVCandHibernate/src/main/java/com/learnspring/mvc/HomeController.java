package com.learnspring.mvc;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learnspring.mvc.dao.DeveloperDao;
import com.learnspring.mvc.model.Developer;

@Controller
public class HomeController {
	
	DeveloperDao dao;
	
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
	
	@GetMapping("getDevelopers")
	public String getDevelopers(Model m) {
		List<Developer> developers = Arrays.asList(
				new Developer(101, "Mary Jane Johnson"),
				new Developer(102, "Bruce Wayne"),
				new Developer(103, "Peter Parker"));
		m.addAttribute("developers", developers);
		return "showDevelopers";
	}
}
