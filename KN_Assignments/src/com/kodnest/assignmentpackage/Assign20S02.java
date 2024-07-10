package com.kodnest.assignmentpackage;
import java.util.Scanner;
public class Assign20S02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User! Please enter a number");
		int num = s.nextInt();
		if(num % 2 == 0)
		{
			System.out.println(num+ " is multiple of 2");
		}
		else
		{
			System.out.println(num+ " is NOT multiple of 2");
		}

	}

}
