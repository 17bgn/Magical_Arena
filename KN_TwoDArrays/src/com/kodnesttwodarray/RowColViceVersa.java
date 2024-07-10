package com.kodnesttwodarray;

public class RowColViceVersa {

	public static void main(String[] args) {
		int a[][]= {{10,5,21},{4,7,27},{11,16,2}};
		System.out.println("Printing Elements");
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				System.out.printf("%02d%1s",a[i][j]," ");
			}
			System.out.println();
		}
		System.out.println("Replacing row elements with columns elements");
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i;j<=a[i].length-1;j++) {
				int temp = a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		System.out.println("Printing Replaced row elements with columns elements");
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				System.out.printf("%02d%1s",a[i][j]," ");
			}
			System.out.println();
		}
	}

}
