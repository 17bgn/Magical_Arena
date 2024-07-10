package com.kodnest.passby;

public class PassByValue {

	public static void main(String[] args) {
		int num=50;
		System.out.println("Original num = "+num);
		modify(num);
		System.out.println("num after modification modify = "+num);

	}
	public static void modify(int numCopy) {
		System.out.println("Original numCopy = "+numCopy);
		numCopy=100;
		System.out.println("numCopy after modification = "+numCopy);
	}

}
