package com.kodnesttwodarray;
import java.util.Scanner;
public class SpiralTwoDArray {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a[][]= {{8,7,5,4,8},
					{0,9,10,6,21},
					{47,69,34,15,17},
					{20,34,46,66,55},
					{4,6,2,5,1}};
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
					System.out.printf("%02d%s",a[i][j]," ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				if(i==0 || j==a[i].length-1) {
					//System.out.printf("%02d%s",a[i][j]," ");
					System.out.println(a[i][j]); }
			}
		}
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=a[i].length-1;j>=0;j--) {
				if(j!=a[i].length-1 &&i==a.length-1) {
					System.out.println(a[i][j]); }
			}
		}
		
		for(int i=a.length-1;i>=0;i--) {
			for(int j=a[i].length-1;j>=0;j--) {
				if((i>=1 && i<a.length-1) && j==0){
					System.out.println(a[i][j]); }
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
