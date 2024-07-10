package com.kodnestpatterns;

public class Hw1 {
	
	public static void main(String[] args) {
		System.out.println("\n1st Pattern\n");
		for (int i =1;i<=3;i++) {
			for(int j=1;j<=9;j++) {
				if((i==1 &&(j==1 || j==4 ||j==7))||i==3) {
					System.out.print("*"); }
				else if(i==2 && (j==1||j==2||j==4||j==5||j==7||j==8)){
					System.out.print("*"); }
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("\n2nd Pattern\n");
		for(int m=1;m<=5;m++) {
			for(int n=1;n<=4;n++) {
				if(n==1 || n==2 || m==3 || m==4|| m==5) {
					System.out.print("*"); 
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		System.out.println("\n3rd Pattern\n");
		for(int x=1;x<=5;x++) {
			for(int y=1;y<=5;y++) {
				if(x+y==4 || x-y==2||x+y==8||(x==2&&y==4)) {
					System.out.print("*"); 
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		System.out.println("\n4th Pattern\n");
		for(int a=1;a<=7;a++) {
			for(int b=1;b<=7;b++) {
				if(a==4 || b==4 || a+b==5||a-b==3||a+b==11||b-a==3) {
					System.out.print("*");
				}
				else if(a==3 && (b==3 || b==5)|| (a==5 &&(b==3 || b==5)) ){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
}
