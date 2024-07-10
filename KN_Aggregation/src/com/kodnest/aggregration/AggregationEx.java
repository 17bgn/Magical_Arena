package com.kodnest.aggregration;

class Pilot{
	String name;
	Pilot(String name) {
		this.name=name;
	}
	void fly() {
		System.out.println(name+" is Flying the Plane");
	}
	
}
class Airlines{
	
	String airlineName;
	Pilot p;
	
	Airlines(String airline, Pilot name) {
		
		this.airlineName = airline;
		this.p=name;
	}
	
	void operation() {
		System.out.println(airlineName+" Operating....");
		p.fly();
	}
}
public class AggregationEx {
	public static void main(String[] args) {
		Pilot p =new Pilot("Guru");
		p.fly();
		Airlines a= new Airlines("Tata Airlines",p);
		a.operation();
		
		a=null;
		//a.operation();
		p.fly();
		
		
	}
}
