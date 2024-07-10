package com.abstractpackage;

interface StudentActivity{
	void study();
	void sleep();
	void eat();
	void play();
}
class EEEStudent implements StudentActivity{

	@Override
	public void study() {
		System.out.println("EEE Student Studying");
		
	}

	@Override
	public void sleep() {
		System.out.println("EEE Student Sleeping");
		
	}

	@Override
	public void eat() {
		System.out.println("EEE Student Eating");
		
	}
	@Override
	public void play() {
		System.out.println("EEE Student Playinig");
	}
	/*public void eeeStudent(EEEStudent es) {
		es.study();
		es.sleep();
		es.eat();
		es.play();
	}*/
	
}
class ITStudent implements StudentActivity{
	@Override
	public void study() {
		System.out.println("IT Student Studying");
		
	}

	@Override
	public void sleep() {
		System.out.println("IT Student Sleeping");
		
	}

	@Override
	public void eat() {
		System.out.println("IT Student Eating");
		
	}
	@Override
	public void play() {
		System.out.println("IT Student Playinig");
	}
}

