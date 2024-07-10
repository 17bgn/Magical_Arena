package com.kodnest.array;

import java.util.Scanner;
public class ReverseArrayElem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Read the elements into array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("order elements from array");
		for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
		}                             
		System.out.println("Reverse order elements from array");
		for(int i=arr.length-1;i>=0;i--) {
				System.out.println(arr[i]);
		}                          

	}

}
