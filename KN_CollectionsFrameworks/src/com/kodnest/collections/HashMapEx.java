package com.kodnest.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
public class HashMapEx {

	public static void main(String[] args) {
//	HashMap<Integer, String> hm= new HashMap<Integer, String>();
//	hm.put(1,"Java-SQL");
//	hm.put(5,"Testing");
//	hm.put(3,"HTML-CSS");
//	hm.put(2,"JavaScript");
//	hm.put(4,"Python");
//	System.out.println(hm);
//	
//	for(int i=1;i<=hm.size();i++) {
//		System.out.println(hm.get(i));
//	}
		
		LinkedHashMap<Integer, String> hm= new LinkedHashMap<Integer, String>();
		hm.put(1,"Java-SQL");
		hm.put(5,"Testing");
		hm.put(3,"HTML-CSS");
		hm.put(2,"JavaScript");
		hm.put(4,"Python");
		System.out.println(hm);
		
		for(int i=1;i<=hm.size();i++) {
			System.out.println(hm.get(i));
		}


}}