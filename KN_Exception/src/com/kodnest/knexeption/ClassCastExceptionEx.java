package com.kodnest.knexeption;

public class ClassCastExceptionEx {

	public static void main(String[] args) {
		Object o = "Hello";
		Integer i =(Integer )o;
		System.out.println(i);
	}

}
