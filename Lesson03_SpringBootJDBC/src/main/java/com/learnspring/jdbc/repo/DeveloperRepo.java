package com.learnspring.jdbc.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.learnspring.jdbc.model.Developer;


@Repository
public class DeveloperRepo {
	
	private JdbcTemplate template;
	
	public void save(Developer developer) {
		
	}
	
	public List<Developer> getAll() {
		return new ArrayList<>();
	}

}
