package com.kodnest.bean;

public class Laptop {
	String name;
	String colour;
	
	public Laptop() {
		super();
		System.out.println("0-Param constr");
	}
	
	public Laptop(String name, String colour) {
		super();
		this.name = name;
		this.colour = colour;
		System.out.println("Param constr");
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", colour=" + colour + "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Setter name");
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
		System.out.println("setter color");
	}
}
