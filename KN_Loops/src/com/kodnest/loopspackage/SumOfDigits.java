package com.kodnest.loopspackage;

public class SumOfDigits {

	public static void main(String[] args) {
		int n= 12345;
		int temp=n;
		
		int sum=0;
		
		int store;
		
		while(n>0) {
			store=n%10;
			sum = sum +store;
			n=n/10;
		}
		System.out.println("sum of "+temp+" number = "+sum);

	}

}
