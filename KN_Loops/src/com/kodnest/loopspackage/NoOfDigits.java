package com.kodnest.loopspackage;

public class NoOfDigits {

	public static void main(String[] args) {
		long a = 9347838350L;
		int count = 0;
		while(a>0) {
			a=a/10;
			count++;
		}
		System.out.println(count);

	}

}
