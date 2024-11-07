package com.learnspring.mvc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Developer {
	
	@Id
	private int developerId;
	private String name;
	
	public Developer() {
		
	}
	
	public Developer(int developerId, String name) {
		super();
		this.developerId = developerId;
		this.name = name;
	}

	public int getDeveloperId() {
		return developerId;
	}
	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Developer [developerId=" + developerId + ", name=" + name + "]";
	}
	
	
	

}
