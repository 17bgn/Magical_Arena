package com.kodnest.programming;

import java.util.Scanner;

public class Application1 {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		Question1 q1 = new Question1();
		System.out.println("Enter a long data type number");
		long a = s.nextLong();
		System.out.println("Enter a long data type number");
		long b = s.nextLong();
		long result = q1.galaticAddition(a,b);
		System.out.println("galaticAddition = "+result);
	}
}
