package com.kodnest.customexception;

public class A {
	void display() {
		System.out.println("Parent Class");
	}
}
class B extends A {
	void display() throws SQLException {
		System.out.println("Child Class");
	}
}
