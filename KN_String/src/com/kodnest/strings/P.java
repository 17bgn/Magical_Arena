package com.kodnest.strings;
import java.util.Scanner;
public class P {
	public static void main(String[] args) {
		 String input = "Java is fun";
	        String[] words = input.split(" ");
	        String output = "";
	        String firstCharacter = "";
	        for (int i = words.length-1; i >= 0; i--) {
	            output += words[i];
	            if (i != 0) {
	                firstCharacter = words[i+1].substring(0, 1);
	            }
	        }
	        output += firstCharacter;
	        System.out.println(output);
	}
	

}
