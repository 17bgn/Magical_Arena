package com.kodnest.constructorpackage;

public class Student {
	 String name;
	 int age;
	 float marks;
	 
	 public Student(String a, int b, float c)
	 {
		name = a;
		System.out.println(name);
		age = b;
		System.out.println(age);
		marks = c;
		System.out.println(marks);
	 }
	 void study() {
		 System.out.println("Studying");
	 }
}
