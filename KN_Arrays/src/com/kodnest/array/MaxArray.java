package com.kodnest.array;
import java.util.Scanner;
public class MaxArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		byte size = s.nextByte();
		byte a[] = new byte[size];
		System.out.println("Enter the elements into Arrays");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextByte();
		}
		//Assuming max element is first index of array
		byte max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum = "+max);
	}
}
