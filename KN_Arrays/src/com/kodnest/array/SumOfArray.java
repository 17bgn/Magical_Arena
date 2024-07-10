package com.kodnest.array;
import java.util.Scanner;
public class SumOfArray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of subjects");
		int subSize = s.nextInt();
		int subject[] = new int[subSize];
		System.out.println("Enter the marks of subjects");
		for(int i=0;i<subject.length;i++) {
			subject[i]=s.nextInt();
		}
		System.out.println("Marks of the subjects");
		for(int i=0;i<subject.length;i++) {
			System.out.println(subject[i]);
		}
		
		int sum=0;
		for(int i=0;i<subject.length;i++) {
			sum=sum+subject[i];
		}
		System.out.println("Sum of all subject marks = "+sum);
	}

}
