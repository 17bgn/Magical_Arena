package com.kodnest.programming;

import java.util.Scanner;

public class Application6 {
		public static void main(String[] args) {
			Scanner s =new Scanner(System.in);
			Question6 q6 = new Question6();
			System.out.println("Enter the fahrenheit value");
			double fahrenheit = s.nextDouble();
			double result  = q6.convertFahrenheitToCelsius(fahrenheit);
			System.out.println("convertFahrenheitToCelsius = "+result);
		}
	

}
