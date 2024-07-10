package com.kodnest.customexception;
class MyException extends Exception{

	public MyException(){
		super("Withdraw amount is morethan actual balance in the A/C");
	}
}
