package com.learnspring.mvc;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnspring.mvc.dao.DeveloperDao;
import com.learnspring.mvc.model.Developer;

@Controller
public class HomeController {
	
	@Autowired
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
	public String addDeveloper(@ModelAttribute("developers") Developer d) {
		
		dao.addDeveloper(d);
		return "showDevelopers";
		
	}
	
	@GetMapping("getDevelopers")
	public String getDevelopers(Model m) {
		m.addAttribute("developers", dao.getDevelopers());
		return "showDevelopers";
	}
	
	@GetMapping("getDeveloper")
	public String getDeveloper(@RequestParam int devId, Model m) {
		
	}
}
