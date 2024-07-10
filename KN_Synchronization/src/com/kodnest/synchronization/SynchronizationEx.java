package com.kodnest.synchronization;

public class SynchronizationEx {
	public static void main(String[] args) {
		Hospital h = new Hospital();
		Thread t = new Thread(h);
		t.setName("Thor");
		Thread t1= new Thread(h);
		t1.setName("IronMan");
		
		t.start();
		t1.start();
	}
}
class Hospital implements Runnable{

	@Override
	public synchronized void run() {
		try {
			String name= Thread.currentThread().getName();
			System.out.println(name+ " is in ICU");
			Thread.sleep(2000);
			System.out.println(name+" is getting Treatment ");
			Thread.sleep(2000);
			System.out.println(name+" is getting discharged");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
