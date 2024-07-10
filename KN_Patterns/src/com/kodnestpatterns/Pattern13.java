package com.kodnestpatterns;

public class Pattern13 {

	public static void main(String[] args) {
		System.out.println("\n  To You 🫵✍️ :) \n");
		for(int i=1; i<=10;i++) {
			for(int j=1;j<=12;j++){
				if((i==1&&(j==5||j==11)) || (i==2&&(j==4||j==6||j==10||j==12))) {
					System.out.print("* "); }
				else if((i==3&&(j==7||j==9||j==4||j==12)) || (i==4&&(j==8||j==4||j==12))) {
					System.out.print("* "); }
				else if((i==5&&(j==5||j==11)) || (i==6&&(j==6||j==10))) {
					System.out.print("* "); }
				else if((i==7&&(j==7||j==9)) || (i==8&&(j==8))) {
					System.out.print("* "); }
				else if((i==9 || i==10)&&j==8) {
					System.out.print("."); }
				else {
					System.out.print("  "); }
			}System.out.println(" ");
		}
	}
}
