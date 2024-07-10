package com.kodnest.assignmentpackage;

import java.util.Scanner;
public class Assign20S08{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User! Please enter a number");
		int num = s.nextInt();
		if((num % 3 == 0) || (num % 5 == 0 && num % 7 == 0))
		{
			System.out.println(num+ " is Multiple of 3 or \nDivisible of 5 and Divisible of 7");
		}
		else
		{
			System.out.println(num+ " is Not Multiple of 3 or \nNOT Divisible of 5 and NOT Divisible of 7");
		}

	}
}

