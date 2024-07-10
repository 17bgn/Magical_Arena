package com.kodnestpatterns;

public class Pattern11 {

	public static void main(String[] args) {
		for(int i=1; i<=9;i++) {
			for(int j=1;j<=5;j++) {
				if(j==1) {
					System.out.print("*");
				}
				else if((i==1 || i==9) && (j==2||j==3||j==4)) {
					System.out.print("*");
				}else if((i==2 || i==3 || i==7 || i==8)&&(j==5)) {
					System.out.print("*");
				}else if((i==4 || i==6)&& (j==4)) {
					System.out.print("*");
				}else if(i==5 && (j==2||j==3)) {
					System.out.print("*");
				}
					else {
					System.out.print(" ");
				}
			}System.out.println(" ");
		}

	}

}
