package com.kodnest.collections;

import java.util.ArrayList;

import java.util.Scanner;

class MyQueue{
	
	ArrayList<Integer> al = new ArrayList<Integer>();

	void enqueue(int ele) {
		al.add(ele);
	}
	void dequeue() {
		if(al.isEmpty()) {
			System.out.println(">>Can't Perform dequeue() - ArrayList is Empty<<");
		}else {
			int a = al.remove(0);
			System.out.println("Element "+a+" of Stack Removed Succesfully");
		}
	}
	void peek() {
		if(al.isEmpty()) {
			System.out.println(">>Can't Perform peek() - ArrayList is Empty<<");
		}else {
			System.out.println("Top Element "+al.get((al.size()-1))+" Retrived Successfully");
		}
	}
	void display() {
		System.out.println("ArrayList Elements = "+al);
	}
}

public class ImplementingQueueUsingCFClasses {

	public static void main(String[] args) {
		//QUEUE means FIFO
		MyQueue ms = new MyQueue();
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("\n-----------------------------------------------------\n"
					+ "Choose which QUEUE operation do you want to perform:");
			System.out.println("1.enqueue()\n2.dequeue()\n3.peek()\n4.for Queue Display()\n5.exit()");
			int num = s.nextInt();
			switch(num) {
			case 1: 
				System.out.println("Enter the Element to be Enqueued");
				int ele = s.nextInt();
				ms.enqueue(ele);
				break;
			case 2:
				ms.dequeue();
				break;
			case 3:
				ms.peek();
				break;
			case 4:
				ms.display();
				break;
			case 5:
				System.out.println("Logged Out Successfully :)");
				s.close();
				System.exit(0);
				break;
			default:
				System.out.println("Please enter the operation number correctly..!!");
			}		
		}
		
	}
}



