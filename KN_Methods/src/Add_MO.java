
public class Add_MO {

	public static void add(int a) {
		System.out.println("The result is = "+a); }
	
	public static void add(int a, int b) {
		System.out.println("The result is = "+(a+b)); }
	
	public static void add(double a, int b) {
		System.out.println("The result is = "+(a+b)); }
	
	public static void add(int a, double b) {
		System.out.println("The result is = "+(a+b)); }
	
	public static void main(String[] args) {
		add(10);
		add(10,20);
		add(50,50.8);
		add(16.895,5);
		add(103,7);
		//add();
		
		System.out.print(1);System.out.print(2);System.out.print(3);
	}
}
