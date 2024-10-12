package com.learnspring.jdbc.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.learnspring.jdbc.model.Developer;


@Repository
public class DeveloperRepo {
	
	public void save(Developer developer) {
		
	}
	
	public List<Developer> getAll() {
		return new ArrayList<>();
	}

}
