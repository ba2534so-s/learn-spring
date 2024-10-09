package com.learn.spring.Lesson02_SimpleSpringProject;

public class Developer {
	
	private int age;
	private Laptop laptop;
	
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

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void code() {
		System.out.println("I am coding...");
	}

}
