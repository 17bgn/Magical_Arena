package com.kodnest.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMain {

	public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	System.out.println(al);
	System.out.println(al.size());
	
	System.out.println("Using For loop");
	for(int i=0;i<al.size();i++) {
		System.out.print(al.get(i)+" ");
	}
	
	System.out.println("\nUsing While loop");
	int j=0;
	while(j<al.size()) {
		System.out.print(al.get(j)+" ");
		j++;	
	}
	
	System.out.println("\nUsing Do-While");
	int k=0;
	do {
		System.out.print(al.get(k)+" ");
		k++;
	}while(k<al.size());
	
	System.out.println("\nUsing for each Loop");
	for(Object i: al) {
		System.out.print(i+" ");
	}
	
	System.out.println("\nUsing Iterator");
	Iterator i =al.iterator();
	while(i.hasNext()) {
		System.out.print(i.next()+" ");
	}
	}
}
