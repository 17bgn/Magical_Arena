package com.kodnest.knexeption;

public class StackOverflowError {

	public static void main(String[] args) {
	fun();

	}
	public static void fun() {
		System.out.println("Overflow");
		fun();
	}

}
