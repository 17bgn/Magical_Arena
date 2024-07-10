package com.kodnestpatterns;

public class Pattern5 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				if(j==i)
					continue;
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");	
			}
			System.out.println();
		}

	}

}
