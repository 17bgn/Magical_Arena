package com.kodnest.producerconsumer;

public class Producer implements Runnable{
	Factory f;
	
	public Producer (Factory f){
		this.f=f;
	}
	public void run() {
		int i=0;
		while(true) {
			f.produce(i++);
		}
		
	}

}
