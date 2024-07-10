package com.kodnest.programming;
import java.util.Scanner;
public class Application5 {
	public static void main(String[] args) {
		Question5 q5 = new Question5();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a double interger nuumber");
		double num1 = s.nextDouble();
		System.out.println("Enter a double interger nuumber");
		double num2 = s.nextDouble();
		double distance = q5.calculateDistance(num1 , num2);
		System.out.printf("calculate Distance = "+"%.2f",distance);
	}
}
