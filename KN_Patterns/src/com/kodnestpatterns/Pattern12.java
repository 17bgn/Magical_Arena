package com.kodnestpatterns;
public class Pattern12 {
	public static void main(String[] args) {
		System.out.println("\nTo my Trainer SHIVA Sir :) \n");
		for(int i=1; i<=9;i++) {
			for(int j=1 ; j<=12;j++) {
				if(i==1 && (j==5 || j==11 )) {
					System.out.print("* ");
				}else if(i==2 && (j==4||j==6||j==10||j==12)) {
					System.out.print("* ");
				}else if(i==3 && (j==7 || j==9 || j==4|| j==12)) {
					System.out.print("* ");
				}else if(i==4 && (j==8 || j==4 || j==12 )) {
					System.out.print("* ");
				}else if(i==5 && (j==5 || j==11)) {
					System.out.print("* ");
				}else if(i==6 && (j==6 || j==10)) {
					System.out.print("* ");
				}else if(i==7 && (j==7 || j==9)) {
					System.out.print("* ");
				}else if(i==8 && (j==8)) {
					System.out.print("* ");
				}else if(i==9 && j==8) {
					System.out.print(".");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
	}
}
