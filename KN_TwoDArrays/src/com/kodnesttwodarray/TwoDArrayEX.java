package com.kodnesttwodarray;
import java.util.Scanner;
public class TwoDArrayEX {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the row size");
		int r =s.nextInt();
		System.out.println("enter the col size");
		int c =s.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Read the elements into 2DArray");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Elements from the 2D Array");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.println(a[i][j]);
			}
		}
		int sum=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				sum=sum+(a[i][j]);
			}
		}
		System.out.println("Sum of Elements = "+sum);
		

	}

}
