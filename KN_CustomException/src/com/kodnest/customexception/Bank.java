package com.kodnest.customexception;
import java.util.Scanner;
public class Bank {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Amount to withdraw");
		int amount = s.nextInt();
		try {
			withdraw(amount);
		} catch (MyException e) {
			System.out.println(e);
		}
	}
	static void withdraw(int amount)throws MyException {
		int balance =10000;
		if(amount > balance) {
			throw new MyException();
		}
		System.out.println("₹"+amount+"/- Withdrawn Successfully.");
	}
}
