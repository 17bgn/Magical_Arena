package com.kodnest.collections;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collections;
public class SortingTypes {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(30);
		al.add(50);
		al.add(50);
		al.add(20);
		System.out.println(al);
		
		TreeSet t = new TreeSet(al);
		System.out.println(t);
		System.out.println("TreeSet Sort: "+t);
		
		Collections.sort(al);
		System.out.println("Collection Sort: "+al);
	}

}
