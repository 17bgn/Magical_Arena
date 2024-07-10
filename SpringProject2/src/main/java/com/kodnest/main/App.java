package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Employee;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Spring FrameWork");

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("application-context.xml");
		
		
		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp1);
	}

}
