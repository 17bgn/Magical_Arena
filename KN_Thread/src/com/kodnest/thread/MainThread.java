package com.kodnest.thread;

public class MainThread {

	public static void main(String[] args) {
		System.out.println("MainThread-start");
		Thread1 t=new Thread1();
		t.start();
		for(int i=1;i<=5;i++) {
			System.out.println("Parent thread");
			Thread.currentThread();
			Thread.yield();
		}

		System.out.println("MainThread-stop");


	}

}
class Thread1 extends Thread{
	public void run() {
		System.out.println("Thread1-start");
		for(int i=1;i<=5;i++) {
			System.out.println("Child thread");
		}
		System.out.println("Thread1-stop");
	}
}
