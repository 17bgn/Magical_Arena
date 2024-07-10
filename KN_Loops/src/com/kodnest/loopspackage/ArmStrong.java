package com.kodnest.loopspackage;

public class ArmStrong {

	public static void main(String[] args) {
		int a = 153;
		int len= Integer.toString(a).length();
		
		int b = a;
		int rem=0;
		double arm =0;
		
		while(a>0) {
			rem = a%10;
			arm = arm+Math.pow(rem,len);
			a=a/10;
		}
		if(arm==b)
			System.out.println("Armstrong number");
		else
			System.out.println("not armstrong number");

	}

}
