package com.kodnest.loopspackage;

import java.util.Scanner;
public class HCF_EX {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = s.nextInt();
		System.out.println("Enter a number");
		int b = s.nextInt();
		int GCD=0;
		for(int i=1; i<=a && i<=b;i++) {
			if(a %i==0 && b % i==0)
			GCD = i;
		}
		System.out.println("GCD = "+GCD);
		s.close();
	}

}
