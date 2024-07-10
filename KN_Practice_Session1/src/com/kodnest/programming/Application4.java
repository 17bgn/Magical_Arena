package com.kodnest.programming;
import java.util.Scanner;
public class Application4 {
	public static void main(String[] args) {
		Question4 q4 = new Question4();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a FirstName");
		String firstName = s.nextLine();
		System.out.println("Enter a LastName");
		String lastName = s.nextLine();
		String result = q4.joinStrings(firstName,lastName);
		System.out.println("joinStrings = "+result);
	}

}
