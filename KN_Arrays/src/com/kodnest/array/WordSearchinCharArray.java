//Not Solved & Not Understand

package com.kodnest.array;
import java.util.Scanner;
public class WordSearchinCharArray {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the row size");
		int sz = s.nextInt();
		System.out.println("Enter the column size");
		int sz2 = s.nextInt();
		char c[][]=new char[sz][sz2];
		// Your solution here
		System.out.println("Enter the char Elements");
		for(int i=0; i<c.length;i++){
			for(int j=0;j<c[i].length;j++){
				c[i][j]=s.next().charAt(0);
			}
		}
		System.out.println("Enter a String Word");
		String st = s.next();
		char c1[]=st.toCharArray();

		int cot=0;
		int cof=0;
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c[i].length;j++){
				if(c1[i]==c[i][j]){
					cot++;
				}else{
					cof++;
				}
			}
		}
		if(cof==0){
			System.out.println("true");

		}else{
			System.out.println("false");
		}

		s.close();
	}
}
