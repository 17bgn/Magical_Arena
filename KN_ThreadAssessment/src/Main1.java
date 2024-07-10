
public class Main1 {

	public static void main(String[] args) {
		System.out.println("Main() Start");
		Task1 t1 = new Task1();
		Thread t = new Thread(t1);
		t.start();
		try {
			t.join(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main() Stop");
	}

}
