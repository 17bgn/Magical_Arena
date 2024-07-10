package com.kodnest.assignmentpackage;
import java.util.Scanner;
public class Assign20S04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User! Please enter a number");
		int num = s.nextInt();
		if((num % 3 == 0) && (num % 5 == 0))
		{
			System.out.println(num+ " is multiple of 3 & 5");
		}
		else
		{
			System.out.println(num+ " is NOT multiple of 3 & 5");
		}

	}

}
