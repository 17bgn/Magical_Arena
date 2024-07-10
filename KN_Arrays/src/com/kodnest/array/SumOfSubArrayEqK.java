 package com.kodnest.array;
import java.util.Scanner;
public class SumOfSubArrayEqK {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENter the size of the Array");
		int sz= s.nextInt();
		System.out.println("ENter the elemnents into Array");
		int a[] = new int[sz];
		for(int i=0; i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Enter the target sum value");
		int target=s.nextInt();
		int count=0;
		int n= a.length;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum= sum+a[j];
				if(sum==target) {
					count++;
				}
			}
		}
		System.out.println("No of times the sum "+target+" came in the subarrays "+count);
	}
	
	
}
