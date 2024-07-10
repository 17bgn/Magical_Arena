package com.kodnest.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListEx3 {

	public static void main(String[] args) {
		CopyOnWriteArrayList al = new CopyOnWriteArrayList();
		al.add(20);
		al.add(30);
		al.add(40);
			/*for(int i=0;i<al.size();i++) {
				System.out.println(al.get(i));
				al.add(90);
			}*/
			/*int i=0;
			/*while(i<al.size()) {
				System.out.println(al.get(i));
				i++;
				al.add(99);
			}/*
			for(Object o: al) {
				System.out.println(o);
				al.add(99);
			}*/
			Iterator i = al.iterator();
			while(i.hasNext()) {
				 System.out.println(i.next());
				 
				 al.add(10);
			}
			System.out.println(al);
	}
}
