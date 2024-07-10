package com.kodnest.programming;
import java.util.Scanner;
public class Application2 {
	public static void main(String[] args) {
		Question2 q2 = new Question2();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a int number");
		int num1 = s.nextInt();
		System.out.println("Enter a int number");
		int num2 = s.nextInt();
		int resultSub = q2.subtractNumbers(num1,num2);
		System.out.println("Subtraction = "+resultSub);
		System.out.println("Enter a int number");
		int numA = s.nextInt();
		System.out.println("Enter a int number");
		int numB = s.nextInt();
		int resultMul = q2.multiplyNumbers(numA, numB);
		System.out.println("Multiplication = "+resultMul);
		System.out.println("Enter a int number");
		int numM = s.nextInt();
		System.out.println("Enter a int number");
		int numN = s.nextInt();
		double resultDiv = q2.divideNumbers(numM,numN);
		System.out.println("Division = "+resultDiv);
		System.out.println("Enter a int number");
		int numX = s.nextInt();
		System.out.println("Enter a int number");
		int numY = s.nextInt();
		int resultRem = q2.findRemainder(numX,numY);
		System.out.println("Remainder = "+resultRem);

	}
}
