package com.kodnesttwodarray;

import java.util.Scanner;

public class CopyTwoDArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[][]= {{10,5,21},{4,7,27},{11,16,2}};
		int b[][]=new int [3] [3];
		
		System.out.println("Printing 2D a array elements");
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				System.out.println(a[i][j]);
			}
		}
		System.out.println("Copying 2D a array elements into b");
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				b[i][j]=a[i][j];
			}
		}
		System.out.println("Printing 2D a array elements");
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				System.out.println(b[i][j]);
			}
		}

	}

}
