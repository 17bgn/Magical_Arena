package com.kodnest.collections;

import java.util.Scanner;

class Array{
	private int arr[];
	private Scanner s = new Scanner(System.in);
	
	public Array(int n) {
		arr = new int[n];
	}
	
	void insert() {
		System.out.println("Enter the postion from 0 to "+(arr.length-1));
		int pos = s.nextInt();
		System.out.println("Enter the element");
		int ele = s.nextInt();
		arr[pos]=ele;
		System.out.println("Insertion Success..");
		System.out.println();
	}
	void delete() {
		System.out.println("Enter the position to delete the element");
		int pos = s.nextInt();
		arr[pos]=0;
		System.out.println("Deletion Success..");
		System.out.println();
	}
	void display() {
		System.out.println("Displaying Array Elements");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
public class ArrayImplementaiton {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size = s.nextInt();
		Array a = new Array(size);
		while(true) {
			System.out.println("Enter 1 for inserting\nEnter 2 for delete\nEnter 3 for display\nEnter 4 for Exit\nChoose the option:");
			int op = s.nextInt();
			switch(op) {
			case 1:
				int again;
				do {
					a.insert();
					System.out.println("Do you want insert again..\nClick 1 for Yes\nClick 0 for No");
					again = s.nextInt();
				}while(again>0);
				break;
			case 2:
				int ag=0;
				do {
				a.delete();
				System.out.println("Do you want delete again..\nClick 1 for Yes\nClick 2 for No");
				ag = s.nextInt();
			}while(ag==1);
				break;
			case 3:
				a.display();
				break;
			case 4:
				System.out.println("Successfully Exited :)");
				System.exit(0);
			default:
				System.out.println("Please Enter Correct Number!!!");
			}
		}
		
	}
}
