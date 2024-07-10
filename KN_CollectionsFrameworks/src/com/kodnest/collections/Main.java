package com.kodnest.collections;

class Student{
	int age;
	String name;
	public Student(int age, String name) {
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		
		return "Student{name:"+name+",age:"+age+"}";
	}
}
public class Main {

	public static void main(String[] args) {
		Student s = new Student(22,"Guru");
			System.out.println(s);

	}

}
