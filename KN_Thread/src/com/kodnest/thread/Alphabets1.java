package com.kodnest.thread;

public class Alphabets1 implements Runnable {
	public void run() {
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);
		for(char c='a';c<='j';c++) {
			System.out.println(c+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("AlphabetsEnd");
	}
}

