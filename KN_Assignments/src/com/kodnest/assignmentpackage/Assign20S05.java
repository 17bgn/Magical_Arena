package com.kodnest.assignmentpackage;
import java.util.Scanner;
public class Assign20S05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User! Please enter a number");
		int num = s.nextInt();
		if((num % 2 == 0) || (num % 3 == 0))
		{
			System.out.println(num+ " is divisible of 2 or 3");
		}
		else
		{
			System.out.println(num+ " is NOT divisible of 2 or 3");
		}

	}

}