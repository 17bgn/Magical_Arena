package com.kodnest.collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

//ImplementingStackandQueueUsingArrayListClass
class MyStack{
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	void push(int ele) {
		al.add(ele);
	}

	public void pop() {
		
		if(al.isEmpty()) {
			System.out.println(">>Can't Perform peek() - ArrayList is Empty<<");
		}else {
			int a = al.remove((al.size()-1));
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
public class ImplementingStackUsingCFClasses {
	
	public static void main(String[] args) {
		//Stack means FILO or LIFO
		MyStack ms = new MyStack();
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("\n-----------------------------------------------------\nChoose which Stack operation do you want to perform:");
			System.out.println("1.push()\n2.pop()\n3.peek()\n4.for Stack Display()\n5.exit()");
			int num = s.nextInt();
			switch(num) {
			case 1: 
				System.out.println("Enter the Element to be Pushed");
				int ele = s.nextInt();
				ms.push(ele);
				break;
			case 2:
				ms.pop();
				break;
			case 3:
				ms.peek();
				break;
			case 4:
				ms.display();
				break;
			case 5:
				System.out.println("Logged Out Successfully :)");
				System.exit(0);
				break;
			default:
				System.out.println("Please enter the operation number correctly..!!");
			}		
		}
		}
		
}

//ArrayList<Integer> al = new ArrayList<Integer>();
////Doing stack operation using ArrayList class of CF
//al.add(10);
//al.add(20);
//al.add(30);// = Stack.push()
//al.add(40);
//al.add(50);
//al.add(60);
//System.out.println("ArrayList elements: "+al);
//System.out.println("Size of the ARRAYLIST : "+al.size());
//System.out.println("Top Element: "+al.get(al.size()-1));//= Stack.peek()
//al.remove(al.size()-1);// = Stack.pop()0
//System.out.println("Removing Top Element: "+al.remove(al.size()-1));// = Stack.pop()
//System.out.println("After Modification Final ArrayList Eelements");
//System.out.println(al);
