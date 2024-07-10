package com.kodnestpatterns;

public class Pattern15 {

	public static void main(String[] args) {
		/*for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("?");
			}
			System.out.println();
		}*/
		
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=3;j++) {
				if(j==1 && i<=3 || (j==2 && i<=3) ||(j==3 && i<=3 )) {
					System.out.print("*");
				}else if(j==1 && i>=3 || (j==2 && i>4)||( j==3 && i>5)) {
					System.out.print("?");
				}
			}System.out.println();
		}
		

	}

}
