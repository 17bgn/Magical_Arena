package com.kodnest.producerconsumer;

public class Consumer implements Runnable{
	Factory f;
	public Consumer(Factory f) {
		this.f=f;
	}
	public void run() {
		int i=0;
		while(true) {
			f.consume(i++);
		}
	}
}
