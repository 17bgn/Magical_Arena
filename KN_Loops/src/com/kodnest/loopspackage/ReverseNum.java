package com.kodnest.loopspackage;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345;
		int rev=0;
		int rem=0;
		while(n>0) {
			rem = n%10;
			rev = rev *10+rem;
			n=n/10;
		}
		System.out.println(rev);

	}

}
