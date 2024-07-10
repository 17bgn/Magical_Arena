package com.kodnest.producerconsumer;

public class Factory {
	int i;
	boolean flag=false;
	synchronized void produce(int i) {
		try {
			if(!flag) {
				this.i=i;
				System.out.println("Produced Item : "+i);
				Thread.sleep(1000);
				flag = true;
				notify();
			}else {
				wait();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	synchronized void consume(int i) {
		try {
			
			if(flag) {
				this.i=i;
				Thread.sleep(1000);
				System.out.println("Consumed Item : "+i);
				flag =false;
				notify();
			}else {
				wait();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
