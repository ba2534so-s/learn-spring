package com.learn.spring.Lesson02_SimpleSpringProject;

public class Desktop implements Computer {
	
	private int memory;

	public Desktop(int memory) {
		this.memory = memory;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	public void compile() {
		System.out.println("Compiling code...");
	}

	
}
