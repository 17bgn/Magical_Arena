package com.kodnest.programming;
import java.util.Scanner;
public class Application13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Question13 q13 = new Question13();
		System.out.println("Enter a principal value");
		double principal = s.nextDouble();
		System.out.println("Enter rate of intrest");
		double rate = s.nextDouble();
		System.out.println("Enter the time");
		double time = s.nextDouble();
		System.out.println();
		q13.calculateSimpleInterest(principal, rate, time);

	}

}
