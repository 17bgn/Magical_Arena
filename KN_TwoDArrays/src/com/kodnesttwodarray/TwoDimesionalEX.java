package com.kodnesttwodarray;

import java.util.Scanner;
public class TwoDimesionalEX {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the toatl no of classes");
		int clSize= s.nextInt();
		System.out.println("Please enter the toatl no of studenets");
		int stSize = s.nextInt();
		int [] [] m = new int[clSize][stSize];
		System.out.println("Enter the Elements into 2D_Array");
		for(int clases = 0;clases<m.length;clases++) {
			for(int student = 0;student<m[clases].length;student++) {
				m[clases][student]=s.nextInt();
			}
		}
		System.out.println("Elements from 2D_Array");
		for(int clases = 0;clases<m.length;clases++) {
			for(int student = 0;student<m[clases].length;student++) {
				System.out.println(m[clases][student]);
			}
		}
		
		
		
		
		
		
		/*m[0][0]=40;
		m[0][1]=50;
		m[0][2]=60;
		m[1][0]=80;
		m[1][1]=70;
		m[1][2]=90;
		m[2][0]=85;
		m[2][1]=45;
		m[2][2]=35;
		System.out.println(m[0][0]);
		System.out.println(m[0][1]);
		System.out.println(m[0][2]);
		System.out.println(m[1][0]);
		System.out.println(m[1][1]);
		System.out.println(m[1][2]);
		System.out.println(m[2][0]);
		System.out.println(m[2][1]);
		System.out.println(m[2][2]);
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				System.out.println(m[i][j]);
			}
		}*/
	}

}
