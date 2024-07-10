//Enter the Input
//10 20 30 40 
//Enter the Input
//20 50 60 30
//[10, 20, 30, 40, 50, 60]


package com.kodnest.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;

public class PracticeQuestion {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		ArrayList a2 = new ArrayList();
		TreeSet ts = new TreeSet();
		HashSet hs = new HashSet();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Input");
		String input1 = s.nextLine();
		System.out.println("Enter the Input");
		String input2 = s.nextLine();
		
		String split1[]= input1.split(" ");
		String split2[]= input2.split(" ");
		
		for(Object o1: split1) {
			a1.add(o1);
		}
		for(Object o2: split2) {
			a2.add(o2);
		}
		
		ts.addAll(a1);
		ts.addAll(a2);
		System.out.println(ts);
		
		

	}

}
