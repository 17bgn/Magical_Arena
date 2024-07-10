package com.kodnest.inheritance;

public class BotFactory {

	public static void main(String[] args) {
		TrainerBot t = new TrainerBot();
		t.read();
		t.write();
		t.walk();
		t.teach();
		System.out.println();
		DoctorBot d = new DoctorBot();
		d.read();
		d.write();
		d.walk();
		d.operate();
		System.out.println();
		StudentBot s = new StudentBot();
		s.read();
		s.write();
		s.walk();
		s.applySkills();
		
	}

}
