package com.kodnest.programming;
import java.util.Scanner;
public class Application8 {

	public static void main(String[] args) {
		Question8 q8 = new Question8();
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a int Number");
		int num = s.nextInt();
		int result = q8.squareNumber(num);
		System.out.println("squareNumber = "+result);
	}

}
