package com.kodnest.programming;
import java.util.Scanner;
public class Application3 {
	public static void main(String [] args)
	{
		Question3 q3 = new Question3();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a int number");
		int num1 = s.nextInt();
		int result = q3.doubleTheNumber(num1);
		System.out.println("doubleTheNNumber = "+result);
	}
}
