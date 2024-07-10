package com.kodnest.inheritance;

class A{
	int age;
}
class B extends A{
	String name;
	public B(int a) {
		
	}
}
public class ConstructorEx {

	public static void main(String[] args) {
		B b = new B(10);
		System.out.println(b.name);	
		System.out.println(b.age);	

	}

}
