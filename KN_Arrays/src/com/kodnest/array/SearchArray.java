package com.kodnest.array;
import java.util.Scanner;
public class SearchArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENter the size of Array");
		int size=s.nextInt();
		int a [] = new int [size];
		System.out.println("Enter the elements into Array");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Print the elements");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Which element u want to search");
		int element = s.nextInt();
		int present=0;
		//int count=0;
		for(int i=0;i<a.length;i++) {
			if(element==a[i]) {
				present++;
			}
		}
		if(present>0) {
			System.out.println(element+" Present e"+present+" times ");
		}else {
			System.out.println(element+" Not Present");
		}
		
		/*for(int m:a) {
			if(element==m) {
				count++;
			}
		}
		if(count>0) {
			System.out.println(element+" Present");
		}else {
			System.out.println(element+" Not Present");
		}*/
	}
}
