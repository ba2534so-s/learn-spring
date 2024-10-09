package com.learn.spring.Lesson02_SimpleSpringProject;

public class Laptop implements Computer {
	
	private int memory;
	
	/*
	public Laptop() {
		System.out.println("Creating laptop...");
	}
	*/
	
	public Laptop(int memory) {
		System.out.println("Creating laptop...");
		this.memory = memory;
	}
	
	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public void compile() {
		System.out.println("Compiling code in laptop...");
	}

}
