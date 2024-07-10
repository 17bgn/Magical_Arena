package com.kodnest.thread;

public class DaemonMain {

	public static void main(String[] args) {

		DaemonTask1 t1=new DaemonTask1("typing");
		DaemonTask1 t2 = new DaemonTask1("autoCorrection");
		DaemonTask1 t3 = new DaemonTask1("autoSuggestion");
		
		t1.start();
		
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t2.setPriority(1);
		t3.setPriority(1);
		
		t2.start();
		t3.start();
	}
}
///*Thread.currentThread().setPriority(8);
//System.out.println(Thread.currentThread());
//System.out.println(Thread.currentThread().getPriority());*/
