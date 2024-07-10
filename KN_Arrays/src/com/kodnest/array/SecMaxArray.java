package com.kodnest.array;
import java.util.Scanner;
public class SecMaxArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = s.nextInt();
		int a[] = new int[size];
		System.out.println("Read the elements into Array");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.println("Element "+i+" = "+a[i]);
		}
		int max =a[0];
		int secMax = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				secMax = max;
				max =a[i];
			}
			else if(a[i]>secMax && a[i]!=max) {
				secMax=a[i];
			}
		}
		System.out.println("Second Maximum Element = "+secMax);
		
	}

}
