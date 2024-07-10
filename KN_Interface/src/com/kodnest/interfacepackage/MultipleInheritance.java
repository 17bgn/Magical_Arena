package com.kodnest.interfacepackage;

public interface MultipleInheritance {
	void mi1();
	int a = 17;
}
class AnotherParent{
	public void mi2() {
		System.out.println("MultipleInheritance special method");
	}
}
class MISubClass extends AnotherParent implements MultipleInheritance{

	@Override
	public void mi1() {
		// TODO Auto-generated method stub
	}
	
}
