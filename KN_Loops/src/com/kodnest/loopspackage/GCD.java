package com.kodnest.loopspackage;

import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a,b;
		a=s.nextInt();
		int a1 =a;
		b=s.nextInt();
		int b1 =b;
		while(b!=0) {
			int temp = b;
			b= a%b;
			a=temp;
		}
		System.out.println("GCD of "+a1+" and "+b1+" = "+a);

	}

}
