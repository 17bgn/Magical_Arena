package com.kodnest.studentapp;

public class Application {
	public static void main(String[] args) {
			Student s = new Student();
			System.out.println(s.getName());

			s.setName("Guru");
			System.out.println(s.getName());
	}

}
