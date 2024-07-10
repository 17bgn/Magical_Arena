package com.kodnest.polymorphism;

public class DemoShape {

	public static void main(String[] args) {
		Shape s; //= new Shape();
		//s.draw();
		
		Circle c = new Circle();
		//c.draw();
		
		Rectangle r = new Rectangle();
		//r.draw();
		
		s=c;
		s.draw();
		s=r;
		s.draw();
		
	}

}
