package com.kodnest.knexeption;

public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int m =10;
		int n=5;
		System.out.println(m/n);
		int a=5;
		int b=0;
		System.out.println(a/b);*/
		
		//to tackle exception use try catch block
		try {
			int i=5;
			int j=0;
			System.out.println(i/j);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			//9System.out.println("Try to divide with +ve denominator");
		}
		
	}

}
