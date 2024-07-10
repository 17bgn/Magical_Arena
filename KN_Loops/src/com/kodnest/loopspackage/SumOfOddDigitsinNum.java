package com.kodnest.loopspackage;

import java.util.Scanner;
public class SumOfOddDigitsinNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		int sum =0 ;
		int rem=0;

		while(n>0) {
			rem = n%10;
			if(rem%2 !=0) {
				sum =sum+rem;
			}
			n=n/10;
		}
		System.out.println(sum);

	}

}
