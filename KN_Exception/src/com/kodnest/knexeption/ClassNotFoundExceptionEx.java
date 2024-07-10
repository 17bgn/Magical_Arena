package com.kodnest.knexeption;

public class ClassNotFoundExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("Demo");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
