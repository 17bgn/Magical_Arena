package com.kodnest.programming;
import java.util.Scanner;
public class Application15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Question15 q15 = new Question15();
		System.out.println("Enter the Number");
		double number = s.nextDouble();
		q15.halveTheNumber(number);

	}

}
