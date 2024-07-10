package com.kodnest.loopspackage;

import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print first 5 prime numbers
		
		Scanner s = new Scanner(System.in);
		int min =s.nextInt();
		int max =s.nextInt();
		int j;
		int pc=0;
		for(int a=min;a<=max;a++) {
			int count=0;
			for(int i=1;i<=a;i++) {
				if(a%i==0)
					count++;
			}
			if(count==2 ) {
				System.out.print(a+" ");
				pc++;
			}
			
			if(pc==5)
				break;
		}
		
}}