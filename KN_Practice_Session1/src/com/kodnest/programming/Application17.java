package com.kodnest.programming;
import java.util.Scanner;
public class Application17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Question17 q17 = new Question17();
		System.out.println("Enter the Number");
		int intsideLength = s.nextInt();
		q17.calculatePlotArea(intsideLength);
		System.out.println("Enter the Number");
		double doublesideLength = s.nextDouble();
		q17.calculatePlotArea(doublesideLength);
	}

}
