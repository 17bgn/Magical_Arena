package com.guruaplhabetpatterns;
public class D4 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=5;j++ ) {
				if( (j==1 && i>=5)||i==5 || i==10||j==5 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}

	}

}
