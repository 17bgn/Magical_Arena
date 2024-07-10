package com.kodnest.assignmentpackage;

import java.util.Scanner;
public class Assign20S07{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User! Please enter a number");
		int num = s.nextInt();
		if((num % 2 == 0) || (num % 6 == 0))
		{
			System.out.println(num+ " is Multiple of 2 or Divisible of 6");
		}
		else
		{
			System.out.println(num+ " is NOT Multiple of 2 or NOT Divisible of 6");
		}

	}
}

