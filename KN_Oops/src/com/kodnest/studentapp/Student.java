package com.kodnest.studentapp;

class Student{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name="Antony";
	int age;
	
	void study() {
		System.out.println("Studying");
	}
	void sleep() {
		System.out.println("Sleeping");
	}
}
