package com.kodnest.assignmentpackage;

import java.util.Scanner;
public class Assign20S03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User! Please enter a number");
		int num = s.nextInt();
		if(num % 3 == 0)
		{
			System.out.println(num+ " is divisible of 3");
		}
		else
		{
			System.out.println(num+ " is NOT divisible of 3");
		}

	}

}
