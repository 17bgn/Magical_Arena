package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Laptop;

public class App {

	public static void main(String[] args) {

		System.out.println("Spring FrameWork");

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("application-context.xml");
		
		System.out.println("\nLaptop-1_Details:\n");
		Laptop lap1 = (Laptop) context.getBean("lap1");
//		System.out.println("Laptop Name: "+lap1.getName());
//		System.out.println("Laptop Colour: "+lap1.getColour());
		System.out.println(lap1);
		System.out.println("\nLaptop-2_Details:\n");
		Laptop lap2 = (Laptop) context.getBean("lap2");
//		System.out.println("Laptop Name: "+lap2.getName());
//		System.out.println("Laptop Colour: "+lap2.getColour());
		System.out.println(lap2);
//		System.out.println("\nLaptop-3_Details:\n");
//		Laptop lap3 = (Laptop) context.getBean("lap3");
//		System.out.println("Laptop Name: "+lap3.getName());
//		System.out.println("Laptop Colour: "+lap3.getColour());
//		System.out.println(lap3);
//		System.out.println("\nLaptop-4_Details:\n");
//		Laptop lap4 = (Laptop) context.getBean("lap4");
//		System.out.println("Laptop Name: "+lap4.getName());
//		System.out.println("Laptop Colour: "+lap4.getColour());
//		System.out.println(lap4);

	}

}
