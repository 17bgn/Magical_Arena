
public class Assignment {
	
	public static void main(String[] args) {
		System.out.println("Swapping With 3rd variable ");
		int a =10;
		int b = 20;
		int c = a;
		a= b;
		b= c;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("Swapping Without 3rd variable ");
		int m = 100;
		int n = 200;
		m = m + n;
		n = m - n;
		m = m - n;
		System.out.println("m = "+m);
		System.out.println("n = "+n);
	}

}
