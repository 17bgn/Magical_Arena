package com.kodnest.binarypackage;
import java.util.Arrays;
import java.util.Scanner;
public class BinaryEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/*int a[]= {13,34,67,89,44,76};
		System.out.println("Before Sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		//Bubble Sorting
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp; }
			}
		}
		System.out.println("\nAfter Bubble Sorting");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}*/

		int a[] = {13,34,67,89,44,76};
		Arrays.sort(a);
		int ele=13;
		int low =0;
		int high=5;
		int flag=0;
		int mid;
		while(low<=high) {
			mid =(low+high)/2;
			if(a[mid]==ele) {
				System.out.println(" ELement Found");
				flag++;
				break;
			}else if(a[mid]<ele) {
				low=mid+1;
			}else {
				high = mid-1;
			}
		}
		if(flag==0) {
			System.out.println(" ELement not Found");
		}
	}
}
