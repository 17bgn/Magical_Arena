package com.kodnest.collections;

import java.util.Hashtable;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

public class LegacyClasses {

	public static void main(String[] args) {
		//Stack,vector,Hashtable,Properties,Dictionary,Enumeration
		Stack s = new Stack();
		s.add(20);
		s.add(10);
		System.out.println(s+"\n");
		
		 Vector v = new Vector();
		 v.add(200);
		 v.add(100);
		 System.out.println(v+"\n");
		 
		 Hashtable h = new Hashtable();
		 h.put(1, 20);
		 h.put(2, 10);
		 System.out.println(h+"\n");
		 
		 Properties p = new Properties();
		 p.put(3, 10);
		 p.put(2, 40);
		 p.put(1, 50);
		 System.out.println(p);
	}

}
