package com.kodnest.thread;
public class Main1 {

	public static void main(String[] args) {
		//
		Numbers1 n=new Numbers1();
		n.run();
		Alphabets1 a = new Alphabets1();
		/*Thread t1=new Thread(n);
		t1.start();
		Thread t2=new Thread(a);
		t2.start();*/
		Thread.currentThread().setPriority(6);
		
		
	}

}


/*Thread ct=Thread.currentThread();
  System.out.println(ct);
 *Numbers n = new Numbers();
 *n.setName("FirstThread");
  n.start();
  Alphabets al = new Alphabets();
  al.setName("SecondThread");
  al.start();
 */
