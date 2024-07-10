package com.kodnest.collections;
import java.util.*;
public class PQ3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashSet hs = new HashSet();
		TreeSet ts = new TreeSet();
		System.out.println("ENter the input");
		String input = s.nextLine();
		String split[] = input.split(" ");
		
		for(String o:split) {
			hs.add(o);
		}
		System.out.println("HashSet = "+hs);
		ts.addAll(hs);
		System.out.println("TreeSet = "+ts);
		//Collections.sort(hs);
		
	}

}
