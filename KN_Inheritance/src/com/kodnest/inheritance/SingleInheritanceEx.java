package com.kodnest.inheritance;

class Parent{
	String name="Guru";
	
}
class Child extends Parent{
	int age=21;
}
public class SingleInheritanceEx {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.name);
		System.out.println(c.age);
	}
}
