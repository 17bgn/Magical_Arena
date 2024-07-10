package com.kodnesttwodarray;

import java.util.Scanner;

public class TwoDArrayMatrix {

	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		int a[][]= {{10,5,21},{4,7,27},{11,16,2}};
		/*int a[][]=new int[3][3];
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				(a[i][j])=s.nextInt();
			}
		}*/
		
		//Display specific elements of row/col
		System.out.println("Specific row/col of Matrix Elements");
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				if(i==1) {
					System.out.println(a[i][j]);
				}
			}
		}
		//Sum of the all the matrix elements
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				sum=sum+(a[i][j]);
			}
		}
		System.out.println("sum of all elements of Matrix= "+sum);
		//sum of principal diagonal element
		int sum1=0;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				if(i==j)
				sum1=sum1+(a[i][j]);
			}
		}
		System.out.println("sum of Principal diagonal element = "+sum1);
		//sum of all even elements
		int sum2=0;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				if(a[i][j]%2==0) {
				sum2=sum2+(a[i][j]);}
			}
		}
		System.out.println("sum of Even element = "+sum2);
		//sum of the prime numbers
		int sum3=0;
		for(int i=0;i<=a.length-1;i++) {
			for(int k=0;k<=a[i].length-1;k++) {
				if(isPrime(a[i][k]))
				{
					sum3=sum3+a[i][k];
				}
			}
		}
		System.out.println("Sum of Prime Numbers = "+sum3);
	}
	public static boolean isPrime(int n) {

		if(n<=1) {
			return false; }
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false; }	
		}
		return true;
	}
}
