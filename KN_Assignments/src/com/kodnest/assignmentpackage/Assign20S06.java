package com.kodnest.assignmentpackage;
import java.util.Scanner;
public class Assign20S06{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User! Please enter a number");
		int num = s.nextInt();
		if((num % 4 == 0) && (num % 3 == 0))
		{
			System.out.println(num+ " is Multiple of 4 and Divisible of 3");
		}
		else
		{
			System.out.println(num+ " is NOT Multiple of 4 and NOT Divisible of 3");
		}

	}
}
