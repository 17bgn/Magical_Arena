package com.kodnest.programming;
import java.util.Scanner;
public class Application14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Question14 q14 = new Question14();
		System.out.println("Enter the minutes");
		double minute = s.nextDouble();
		q14.convertToHours(minute);

	}

}
