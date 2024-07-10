package com.kodnest.array;

import java.util.Scanner;
public class MergeArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int s1=s.nextInt();
		System.out.println("Enter the size of the Array");
		int s2=s.nextInt();
		int a[]=new int[s1];
		int b[]=new int[s2];
		int c[]=new int[s1+s2];
		System.out.println("Enter the Elements into a[]");
		for(int i=0;i<s1;i++) {
			a[i]=s.nextInt();
			c[i]=a[i];
		}
		System.out.println("Enter the Elements into b[]");
		for(int i=0;i<s2;i++) {
			b[i]=s.nextInt();
			c[i+s1]=b[i];
		}
		System.out.println("Elements from c[]array");
		for(int i=0;i<s1+s2;i++) {
			System.out.print(c[i]+" ");
		}

	}

}
