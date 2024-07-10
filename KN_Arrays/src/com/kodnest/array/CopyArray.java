package com.kodnest.array;
import java.util.Scanner;
public class CopyArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int x = s.nextInt();
		int arr1[] = new int[x];
		System.out.println("Read the elements into Array");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=s.nextInt();
		}
		System.out.println("Elements from Array");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("\n2nd Array Elements of 1st Array");
		int arr2[] = new int[x];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}

}
