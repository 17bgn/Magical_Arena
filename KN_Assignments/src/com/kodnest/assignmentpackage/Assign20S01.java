package com.kodnest.assignmentpackage;
import java.util.Scanner;
public class Assign20S01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//Gender program
		System.out.println("Select your Gender ->> ( M for Male ) or ( F for Female ) ");
		char gender = s.next().charAt(0);
		
		if(gender == 'M' || gender == 'm')
		{
			System.out.println("Hii Sir!!");
		}
		if(gender == 'F' || gender == 'f')
		{
			System.out.println("Hii Madam!!");
	    }
	}

}
