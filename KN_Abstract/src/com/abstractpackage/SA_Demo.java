package com.abstractpackage;

public class SA_Demo {

	public static void main(String[] args) {
		SA_Demo sa = new SA_Demo();
		EEEStudent es = new EEEStudent();
		ITStudent  is = new ITStudent();
		
		sa.activities(es);
		sa.activities(is);
		

	}
	public void activities(StudentActivity sa) {
		
		sa.study();
		sa.sleep();
		sa.eat();
		sa.play();
	}
	

}
