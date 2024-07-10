package com.kodnest.binarypackage;
import java.util.Scanner;
public class BinaryMethod {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int siz = s.nextInt();
		System.out.println("Enter the Elements into array a[]");
		int a[]= new int[siz];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Displaying the a[] array Elements ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println("Enter the Elements u want to search");
		int srch=s.nextInt();
		binarySearch(a,srch);
		
	}

	public static void binarySearch(int a[], int ele) {
		int low=0;
		int high=a.length-1;
		int mid=0;
		boolean flag=true;
		while(low<=high) {
			mid=(high+low)/2;
			if(a[mid]==ele) {
				System.out.println("Element Found");
				flag=false;
				break;
			}else if(a[mid]>ele) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		if(flag==true) {
			System.out.println("Element not found");
		}
	}
}