package com.kodnest.loopspackage;
import java.util.Scanner;
public class LargestPolindromenumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a num");
		int n=s.nextInt();
		int bigPol=0;
		for(int i=1;i<n;i++){
				if(polindrome(i)) {
					bigPol=i;
				}
		}
		System.out.println("Largest Polindrome < Given Number = "+bigPol);
	
	}
	public static boolean polindrome(int a) {
		int temp=a;
		int rem=0;
		int rev=0;
		while(a>0) {
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
			return rev==temp;
		
	}
}
