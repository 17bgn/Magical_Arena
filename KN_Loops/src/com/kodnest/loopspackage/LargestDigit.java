package com.kodnest.loopspackage;
import java.util.Scanner;
public class LargestDigit {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a num");
		int n=s.nextInt();
		int big=0;
		int rem=0;
		while(n>0) {
			rem=n%10;
			if(rem>big) {
				big=rem;
			}
			n=n/10;
		}
		System.out.println("Big number = "+big);
		
	}
}
