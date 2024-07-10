package com.kodnest.recusrssion;

public class RecurssionEx {
	public static void main(String[] args) {
		System.out.println("1");
		fact(5);
		System.out.println("2");
	}
	public static void fact(int n)
	{
		System.out.println("3");
		if(n==3) {
			System.out.println("4");
			return;
		}
		System.out.println("Executing "+n);
		n--;
		System.out.println("1");
		fact(n);
		System.out.println("22");
	}
}
