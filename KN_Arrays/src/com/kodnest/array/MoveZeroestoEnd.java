package com.kodnest.array;
import java.util.Scanner;
public class MoveZeroestoEnd {

	public static void main(String[] args) {
		// Your code here
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int sz = s.nextInt();
		int a[]= new int[sz];
		System.out.println("Enter the Elements into the Array");
		for(int i=0;i<a.length;i++){
			a[i]=s.nextInt();
		}
		movezeroes(a);
	}
	public static void movezeroes (int a[]){
		int count=0;
		//counting the no of zeroes in the Array a[]
		for(int i=0;i<a.length;i++){
			if(a[i]==0){
				count++;
			}
		}
		//separate array for no of zeroes
		int b[]=new int[count];
		//separate array for non-zeroes
		int c[]=new int[a.length-count];
		int indexB=0;
		int indexC=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==0){
				b[indexB++]=a[i];
			}
			else {
				c[indexC++]=a[i];
			}
		}
		//combining the arrays int single array
		int d[]=new int[a.length];
		int indexD=0;
		for(int i=0;i<c.length;i++){
			d[indexD++]=c[i];
		}
		for(int i=0;i<b.length;i++){
			d[indexD++]=b[i];
		}
		for(int f:d){
			System.out.print(f+" ");
		}
	}
}
