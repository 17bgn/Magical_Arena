//ArrayList-1 = [1, 3, 4, 5]
//ArrayList-2 = [7, 3, 6, 8]
//TreeSet = [1, 3, 4, 5, 6, 7, 8]
package com.kodnest.collections;

import java.util.*;
public class PQ2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		ArrayList a2 = new ArrayList();
		TreeSet t= new TreeSet();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Input-1");
		String s1 = s.nextLine();
		System.out.println("Enter the Input-2");
		String s2 = s.nextLine();
		
		String split1[]=s1.split(" ");
		String split2[]=s2.split(" ");
		
		Collections.addAll(a1,split1);
		Collections.addAll(a2,split2);
		
		System.out.println("ArrayList-1 = "+a1);
		System.out.println("ArrayList-2 = "+a2);
		
		t.addAll(a1);
		t.addAll(a2);
		System.out.println("TreeSet = "+t);

	}

}
