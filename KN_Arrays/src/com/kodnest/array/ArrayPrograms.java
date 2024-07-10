package com.kodnest.array;
import java.util.Scanner;
public class ArrayPrograms {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = s.nextInt();
		int a[]= new int [size];
		System.out.println("Enter the Elements into Array");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Printing the Elements of a[]");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nDisplaying the Elements in Reverse Order");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEven elements from a[]");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");}
		} 
		System.out.println("\nODD elements from a[]");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) {
				System.out.print(a[i]+" ");}
		}
		System.out.println("\nEven Index elements from a[]");
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.print(a[i]+" ");}
		} 
		System.out.println("\nODD Index elements from a[]");
		for(int i=0;i<a.length;i++) {
			if(i%2==1) {
				System.out.print(a[i]+" "); }
		}
		
		System.out.println("\nElements divisible by 5");
		for(int i=0;i<a.length;i++) {
			if(a[i]%5==0) {
				System.out.print(a[i]+" ");}
		} 
		System.out.println("\nElements divisible by 3");
		for(int i=0;i<a.length;i++) {
			if(a[i]%3==0) {
				System.out.print(a[i]+" ");}
		} 
		System.out.println("\nElements divisible by 3 || 5");
		for(int i=0;i<a.length;i++) {
			if(a[i]%5==0 || a[i]%3==0 ) {
				System.out.print(a[i]+" ");}
		} 
		System.out.println("\nElements divisible by 3 && 5");
		for(int i=0;i<a.length;i++) {
			if(a[i]%5==0 && a[i]%3==0 ) {
				System.out.print(a[i]+" ");}
		} 
		
		System.out.println("\nCopying a[] elements into b[]");
		int b[] = new int[size];
		for(int i=0;i<b.length;i++) {
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		int c[]=new int[size];
		System.out.println("\nEnter the Elements into Array c[]");
		for(int i=0;i<c.length;i++) {
			c[i]=s.nextInt();
		}
		System.out.println("Printing the Elements of c[]");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		int d[]= new int[size];
		for(int i=0;i<d.length;i++) {
			d[i]=a[i]+c[i];
		}
		System.out.println("\nAddition of a[] + c[] arrays into d[]");
		for(int i=0;i<d.length;i++) {
			System.out.print(d[i]+" ");
		}
		//Merging Program
		int m[]=new int[size+size];
		System.out.println("\nMerging of a[] and c[] into m[]");
		for(int i=0;i<a.length;i++) {
			m[i]=a[i];
		}
		for(int i=0;i<c.length;i++) {
			m[i+size]=c[i];
		}
		System.out.println("Elements from c[]array");
		for(int i=0;i<m.length;i++) {
			System.out.print(m[i]+" ");
		}

		
	}

}
