package com.kodnest.interfacepackage;

public interface MultilevelInheritance {
	void ml1();
}
interface MultiLevel1 extends MultilevelInheritance{
	void ml2();
	
}
class MultiLevel2 implements MultiLevel1{

	@Override
	public void ml1() {
		System.out.println("Multilevel method1");	
	}

	@Override
	public void ml2() {
		System.out.println("Multilevel method1");	
	}
}
