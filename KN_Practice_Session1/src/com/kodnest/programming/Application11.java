package com.kodnest.programming;
import java.util.Scanner;
public class Application11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Question11 q11 = new Question11();
		System.out.println("Enter a double number");
		double d = s.nextDouble();
		double result = q11.calculateSurfaceArea(d);
		System.out.println("calculateSurfaceArea = "+result);
	}

}
