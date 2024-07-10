package com.kodnest.recusrssion;

public class FactorialRecurssion {
	public static void main(String[] args) {
		int a = 5;
		int res =fact(a);
		System.out.println("Factorial of "+a+" = "+res);
	}
	public static int fact(int a) {
		if(a==0) {
			return 1;
		}else {
			return a * fact(a-1);
		}
	}
}
