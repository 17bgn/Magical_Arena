package com.kodnestthreedarray;
import java.util.Scanner;
public class ThreeArrayEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter the x-y-z sizes");
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
		System.out.println("Enter the Elements into Array");
		int a[][][]=new int[x][y][z];
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				for(int k=0;k<z;k++) {
					a[i][j][k]=s.nextInt();
				}
			}
		}
		System.out.println("Elements from the Array");
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				for(int k=0;k<z;k++) {
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
		}

	}

}



