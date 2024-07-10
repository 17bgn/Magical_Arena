package com.kodnest.programming;
import java.util.Scanner;
public class Application12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Question12 q12 = new Question12();
		System.out.println("Enter a double number");
		double d = s.nextDouble();
		double result = q12.convertInchesToFeet(d);
		System.out.printf("convertInchesToFeet = "+"%.2f",result);

	}

}
