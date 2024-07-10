package com.abstractpackage;

interface Movies{
	abstract void tfi();
	 void bfi();
	 void kfi();
	 void hfi();
	 /*In interface we dont need to use abstract keyword
		to tell that this mthd is abstract mthd 
		bcoz interface only allows abstracts methods*/
	
}
class MovieIndustries implements Movies{

	@Override
	public void tfi() {
		System.out.println("Tollywood Film Industry");
	}
	@Override
	public void bfi() {
		System.out.println("Bollywood Film Industry");
	}

	@Override
	public void kfi() {
		System.out.println("Kollywood Film Industry");
	}

	@Override
	public void hfi() {
		System.out.println("Hollywood Film Industry");
	}
	
}
public class Films {
	public static void main(String[] args) {
		MovieIndustries mi = new MovieIndustries();
		mi.bfi();
		
	}
}
