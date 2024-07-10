package com.kodnest.knexeption;
import java.util.Scanner;
public class ExceptionEx {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to 😎Guru Bank Of India😎");
		int balance= 100000;
		int pin=1715;
		int num;
		try {
			do {
				System.out.println("User! Please Enter your PIN");
					int a = s.nextInt();
				if(a==pin) {
					System.out.println("Savings Account Balance = "+balance);
				}else {
					System.out.println("Wrong pin number..Try again");
				}
				System.out.println("Enter 1 to continue...\n\tor\nEnter 0 to Exit.");
				num=s.nextInt();
			}while(num==1);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Enter Pin in only Digits");
		}
		finally{
			s.close();
			System.out.println("Transaction Completed :)");
		}
		
	
	}
}
