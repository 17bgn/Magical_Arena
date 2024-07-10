package com.kodnest.employeepackage;

public class Application {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.name = "Guru";
		e.age = 23 ;
		e.id = "20785A0204";
		e.salary = 66000;
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.id);
		System.out.println(e.salary);
		e.work();
		e.meet();
		System.out.println();
		Employee e2 = new Employee();
		e2.name = "Madhu";
		e2.age = 22 ;
		e2.id = "20785A0205";
		e2.salary = 70000;
		System.out.println(e2.name);
		System.out.println(e2.age);
		System.out.println(e2.id);
		System.out.println(e2.salary);
		e2.work();
		e2.meet();
	}

}
