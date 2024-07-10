package com.kodnest.array;
import java.util.Scanner;
class Employee{
	String name;
	int age;
	
	public Employee(String name, int age) {
		this.name=name;
		this.age=age;
	}
}
public class EmpArray {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		Employee a[]=new Employee[3];
		/*a[0].name="GURU";
		a[0].age=22;
		a[1].name="Madhu";
		a[1].age=25; 
		a[1].name="Antony";
		a[1].age=25; 
		for(int i=0;i<=a.length-1;i++) {
			System.out.println("Enter the name");
			a[i].name=s.next();
			System.out.println("Enter the Age");
			a[i].age=s.nextInt();
		}*/
		System.out.println("Enter the Employee Details");
		System.out.println("==========================\n");
		int j=1;
		for(int i=0;i<=a.length-1;i++) {
			System.out.println("Enter the Employee "+j+" name");
			String name=s.nextLine();
			System.out.println("Enter the Employee "+j+" Age");
			int age=s.nextInt();
			s.nextLine();
			a[i]=new Employee(name,age);
			j++;
		}
	
		System.out.println("\nEmployee Details");
		System.out.println("==================");
		System.out.printf("%-10s","Name");
		System.out.println("Age");
		for(int i=0;i<=a.length-1;i++) {
			System.out.printf("%-10s%02d%n",a[i].name,a[i].age);
		}
		

	}

}
