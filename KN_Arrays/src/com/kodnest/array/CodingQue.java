package com.kodnest.array;
import java.util.Scanner;
public class CodingQue {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = s.nextInt();
		System.out.println("Enter the elements into a1[]");
		int a1[]=new int[size];
		for(int i=0;i<a1.length;i++) {
			a1[i]=s.nextInt();
		}
		int n=a1.length;		
		int out[]=new int[n];
		int k=2;
		int j=0;
		for(int i=0;i<a1.length;i++) {
			j=(i+k)%n;
			out[i]=a1[j];
		}
		System.out.println("Printing the Elements");
		for(int i=0;i<a1.length;i++) {
			System.out.print(out[i]+" ");
		}
	}

}
//INPUT : 2 3 4 5 6  OUTPUT: 5 6 2 3 4 10,20,50,40,30
