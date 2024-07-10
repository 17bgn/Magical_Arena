package com.kodnest.constructor2package;

public class Application { 

	public static void main(String[] args) {
		StudentApp sa = new StudentApp("Guru",22);
		System.out.println(sa.name);
		System.out.println(sa.age);
		sa.study();

	}

}
