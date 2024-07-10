package com.kodnest.knexeption;

public class ExceptionEx3 {
	public static void main(String[] args) {
		System.out.println("main-start");
		method1();
		System.out.println("main-stop");	
	}

	static void method1() {
		System.out.println("Method1-start");
		method2();
		System.out.println("Method1-stop");
	}

	static void method2() {
		System.out.println("Method2-start");
		try {
			method3();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Method2-stop");
	}

	static void method3() {
		System.out.println("Method3-start");
		
			System.out.println(3/0);
		System.out.println("Method3-stop");
	}
}
