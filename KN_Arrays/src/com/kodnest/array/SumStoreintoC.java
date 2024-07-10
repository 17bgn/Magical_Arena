package com.kodnest.array;

public class SumStoreintoC {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int c[]=new int[3];
		for(int i=0;i<c.length;i++) {
			c[i]=a[i]+b[i];
		}
		System.out.println("Addition of 2 arrays into c[]");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}

	}

}
  