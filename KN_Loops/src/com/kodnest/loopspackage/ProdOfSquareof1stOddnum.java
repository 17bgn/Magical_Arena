package com.kodnest.loopspackage;
import java.util.Scanner;
public class ProdOfSquareof1stOddnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a =s.nextInt();
		int rem=0;
		
		while(a>0) {
			rem=a%10;
			if(rem%2!=0) {
				System.out.println("Product of Square of first odd num ="+(rem*rem));
				break;
			}
			a=a/10;
		}
	}
}
