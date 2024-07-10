package com.kodnest.programming;
import java.util.Scanner;
public class Application16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Question16 q16 = new Question16();
		System.out.println("Enter the Number");
		int number = s.nextInt();
		q16.calculateThrust(number);

	}

}
