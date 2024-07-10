package com.kodnest.array;

public class BorderElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{12,54,45,16,72},{24,95,77,81,93},
				{34,83,17,18,92},{44,77,66,71,84},{54,68,91,41,65}};
		//System.out.println("a length = "+a.length);
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				if(i==0 ||i==a.length-1 || j==0 ||j==a.length-1) {
					System.out.print(a[i][j]+" ");
				}else {
					System.out.print("   ");
				}
			}System.out.println();
		}
	}
}
