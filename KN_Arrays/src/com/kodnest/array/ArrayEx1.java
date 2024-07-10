package com.kodnest.array;

import java.util.Scanner;
public class ArrayEx1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		/*//create an integer array of size 4
		int []n = new int[4];
		//read elements into the array
		n[0] = 10;
		n[1] = 20;
		n[2] = 30;
		n[3] = 40;
		//write elements from the array
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n[3]);

		System.out.println("\n OR \n");*/

		//Same program in dynamic
		System.out.println("Enter the size");
		int a  = s.nextInt();
		int array [] = new int[a];
		for(int i=0;i<a;i++) {
			System.out.println("Enter the Array "+i);
			array[i] = s.nextInt();
		}
		for(int j=0;j<a;j++) {
			System.out.println("\narray "+j+" value");
			System.out.println(array[j]);
		}



	}

}
