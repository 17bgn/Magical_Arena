package com.abstractpackage;
//abstract method
abstract class Vehicle {
	//concrete method
	static void engine() {
		System.out.println("Engine");
	}
	//abstract method
	abstract void gear();
	
}
class YuluBike extends Vehicle{
	
	void gear() {
		System.out.println("Vehicle changing gear");	
	}
}