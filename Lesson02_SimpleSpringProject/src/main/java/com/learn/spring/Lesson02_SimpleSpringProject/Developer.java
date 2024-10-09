package com.learn.spring.Lesson02_SimpleSpringProject;

public class Developer {
	
	private int age;
	private Computer computer;
	
	public Developer() {
		System.out.println("Creating Developer Object...");
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setting age to " + age);
		this.age = age;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public void code() {
		System.out.println("I am coding...");
		computer.compile();
	}

}
