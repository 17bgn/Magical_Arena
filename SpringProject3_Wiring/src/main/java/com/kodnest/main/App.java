package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Trainer;
import com.kodnest.bean.University;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext ("application-context.xml");
		
		Trainer t = (Trainer) context.getBean("t");
		System.out.println(t);
		
		University u = (University) context.getBean("u1");
		System.out.println(u);
		
	}

}
