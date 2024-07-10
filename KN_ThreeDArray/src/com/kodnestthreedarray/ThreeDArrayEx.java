package com.kodnestthreedarray;
   
public class ThreeDArrayEx {

	public static void main(String[] args) {
		int a[][][]= { { {10,20,30},{10,20,40} },
				
						{ {40,50,70},{80,90,80} } 
					 };
			
		System.out.println("Elements from the Array");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
