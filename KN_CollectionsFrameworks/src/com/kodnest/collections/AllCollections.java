package com.kodnest.collections;
import java.util.*;
public class AllCollections {

	public static void main(String[] args) {
		//ArrayList a = new ArrayList();
		//LinkedList a = new LinkedList();
		//ArrayDeque a = new ArrayDeque();
		PriorityQueue a = new PriorityQueue();
		//TreeSet a = new TreeSet();
		//HashSet a = new HashSet();
		//LinkedHashSet a = new LinkedHashSet();
		a.add(10);
		a.add(5);
		a.add(20);
		a.add(15);
		a.add(20);
//		a.add(3.67);		
//		a.add('B');
//		a.add("Guru");
//		a.add(null);
		System.out.println(a);
		System.out.println();
		System.out.println("Using For Loop: ");
		/*for(int i=0;i<a.size();i++) {
			System.out.print(a.get(i)+" ");
		}*/
		System.out.println();
		System.out.println("\nUsing For-Each Loop: ");
		for(Object o : a) {
			System.out.print(o+" ");
		}
		System.out.println();
		System.out.println("\nUsing Iterator");
		Iterator i = a.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		System.out.println();
		
	}

}
