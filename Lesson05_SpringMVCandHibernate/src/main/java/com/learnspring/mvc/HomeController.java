package com.learnspring.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnspring.mvc.dao.DeveloperDao;
import com.learnspring.mvc.model.Developer;

@Controller
public class HomeController {
	
	@Autowired
	private DeveloperDao dao;
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Developers");
	}
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m) {
		int result = i + j;
		m.addAttribute("result", result);
		return "result";
	}
	
	@GetMapping("/getDevelopers")
	public String getDevelopers(Model m) {
		m.addAttribute("developers", dao.getDevelopers());
		return "showDevelopers";
		
	}
	
	@RequestMapping("addDeveloper")
	public String addDeveloper(@ModelAttribute("dev1") Developer d) {
		
		return "result";
		
	}

}
