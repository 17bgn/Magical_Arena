package com.kodnest.collections;
import java.util.ArrayList;
public class ArrayListEx {

	public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(200);
	al.add('g');
	al.add("Guru");
	al.add(1,17);
	System.out.println(al);
	al.set(0,"nag");
	System.out.println(al);
	}

}
