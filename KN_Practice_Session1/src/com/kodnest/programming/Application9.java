package com.kodnest.programming;
import java.util.Scanner;
public class Application9 {

	public static void main(String[] args) {
		Question9 q9 = new Question9();
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a int Number");
		int num = s.nextInt();
		int result = q9.cubeNumber(num);
		System.out.println("cubeNumber = "+result);
	}

}
