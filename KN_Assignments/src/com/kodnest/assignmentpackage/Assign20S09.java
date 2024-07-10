package com.kodnest.assignmentpackage;
import java.util.Scanner;
public class Assign20S09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User! Please Enter a number");
		int num = s.nextInt();
		int count=0;
		System.out.println("\nChecking Positive Number or not");
		if(num > 0)
		{
			System.out.println(num+" is Positive Number");
		}
		else {
			System.out.println(num+" is not Positive number");
		}
		System.out.println("\nChecking Even Number or not");
		if(num % 2 == 0)
		{
			System.out.println(num+" is Even number");
		}else {
			System.out.println(num+" is not Even  number");
		}
		System.out.println("\nChecking Prime Number or not");
		for(int i = 1; i<=num; i++)
		{
			if(num % i ==0) {
				count ++; }
		}
		if(count == 2) {
			System.out.println(num+" is Prime Number");}
		else {
			System.out.println(num+" is NOT Prime Number");}
	}
}
