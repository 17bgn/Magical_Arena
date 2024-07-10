package com.kodnest.knexeption;
import java.util.Scanner;
public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a[]= {10,20,30};
		try {
			for(int b:a) {
				System.out.println(a[5]);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Try to access the elements with in the length");
		}
		try {
			System.out.println(3/0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("\nProgram Completed..");
		}
		
		
		s.close();
		
	}

}
