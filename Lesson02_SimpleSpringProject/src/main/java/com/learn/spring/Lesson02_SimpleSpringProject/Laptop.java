package com.learn.spring.Lesson02_SimpleSpringProject;

public class Laptop {
	
	private int memory;
	
	public Laptop() {
		System.out.println("Creating laptop...");
	}
	
	
	
	
	public Laptop(int memory) {
		this.memory = memory;
	}




	public void compile() {
		System.out.println("Compiling code...");
	}

}
