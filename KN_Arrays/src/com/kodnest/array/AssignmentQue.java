package com.kodnest.array;
import java.util.Scanner;
class SearchEle{
	public static boolean LinearSearch(int a[],int key) {
		for(int i=0;i<a.length;i++) {
			if(key==a[i]) {
				return true;
			}
		}
		return false;
	}
}
public class AssignmentQue {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = s.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the Elements into Array");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Elements from the Array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter the search element");
		int key=s.nextInt();
		
		SearchEle se = new SearchEle();
		boolean b=SearchEle.LinearSearch(a,key);
		if(b==true) {
			System.out.println("Key "+ key+" found");
		}else {
			System.out.println("Key "+ key+" not found");
		}
		/*for(int i=0;i<a.length;i++) {
			if(key==a[i]) {
				System.out.println("Key "+ key+" found at index "+i);
				break;
			}
		}*/
		
	}
	
}