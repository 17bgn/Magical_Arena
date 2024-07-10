package com.kodnest.thread;

public class DaemonTask1 extends Thread{
	public DaemonTask1 (String name){
		super(name);
	}
	public void typing() {
		for(int i=0;i<=5;i++) {
			System.out.println("typing..");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void autoCorrection() {
		for( ; ; ) {
			System.out.println("autoCorrection..");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void autoSuggestion() {
		for( ; ; ) {
			System.out.println("autoSuggestion..");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void run() {
		if(this.getName().equalsIgnoreCase("typing")) {
			typing();
		}else if(this.getName().equalsIgnoreCase("autoCorrection")) {
			autoCorrection();
		}else if(this.getName().equalsIgnoreCase("autoSuggestion")) {
			autoSuggestion();
		}
	}
}


/*DaemonTask1(String name){
super(name);
}
void typing() {
for(int i=0;i<=5;i++) {
	System.out.println("Typing...");
}
}
void autoCorrection() {
System.out.println(Thread.currentThread());
for( ; ; ) {
	System.out.println("Auto Correction");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
}
void autoSuggestion() {
for( ; ; ) {
	System.out.println("Auto Suggestion");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
}
public void run() {

typing();
autoCorrection();
autoSuggestion();
}*/