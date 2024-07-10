package com.kodnest.loopspackage;
import java.util.Scanner;
public class SumofSqunDigitNum {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number");
	int a =s.nextInt();
	int i=1;
	double sum=0;
	while(i<=a) {
		sum=sum+Math.pow(i,2);
		i++;
	}
	System.out.println("Output = "+sum);
}
}
