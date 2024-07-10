package com.kodnest.recusrssion;

public class MultiplicationRecurssion {

	public static void main(String[] args) {
		int res = multiple(5,1);
		System.out.println(res);
	}
	
	public static int multiple(int n, int a) {
		if(a<=10) {
			System.out.println(n+" * "+a+" = "+(n*a));
			multiple(n,(a+1));
		}
		return 0;
	}

} 
