package com.kodnest.programming;

import java.util.Scanner;

public class Application7 {
	

	public static void main(String[] args) {
		Question7 q7 = new Question7();
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the semister 1 marks :");
		int sem1 = s.nextInt();
		System.out.println("Enter the semister 2 marks :");
		int sem2 = s.nextInt();
		System.out.println("Enter the semister 3 marks :");
		int sem3 = s.nextInt();
		System.out.println("Enter the semister 4 marks :");
		int sem4 = s.nextInt();
		System.out.println("Enter the semister 5 marks :");
		int sem5 = s.nextInt();
		System.out.println("Enter the semister 6 marks :");
		int sem6 = s.nextInt();
		System.out.println("Enter the semister 7 marks :");
		int sem7 = s.nextInt();
		System.out.println("Enter the semister 8 marks :");
		int sem8 = s.nextInt();
		double result  = q7.calculateAverage(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8);
		System.out.println("Average of 8 Semister marks:\n"+result);
		
		
	}

}
