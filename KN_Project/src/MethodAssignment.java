import java.util.Scanner;

public class MethodAssignment {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter a integer number to do additon");
		int a =s.nextInt();
		
		System.out.println("Enter a integer number to do additon");
		int b =s.nextInt();
		System.out.println("The addition value = "+addition(a,b));
		System.out.println("The subtraction value = "+subtraction());
		System.out.println("Enter a integer nuumber to do multiplication");
		int m =s.nextInt();
		System.out.println("Enter a integer nuumber to do multiplication");
		int n = s.nextInt();
		multiplication(m,n);
		division();
		System.out.println("Enter a number to find reminder");
		int i = s.nextInt();
		System.out.println("ENter a number to find reminder");
		int j = s.nextInt();
		findRemainder(i,j);
	}
	
	public static int addition(int a,int b) {
		return a+b; }
	
	public static int subtraction() {
		System.out.println("User enter a number to do subtraction");
		int a = s.nextInt();
		System.out.println("User enter a number to do subtraction");
		int b = s.nextInt();
		return a-b ; }
	
	public static void multiplication(int a, int b) {
		System.out.println("The Multiplication value = "+(a*b));}
	
	public static void division() {
		System.out.println("User enter a number to do division");
		int a = s.nextInt();
		System.out.println("User enter a number to do division");
		int b = s.nextInt();
		System.out.println("The Division value of "+a+"/"+b+" = "+(a/b));
	}
	
	public static void findRemainder(int a, int b) {
		System.out.println("Reminder value of "+a+"%"+b+" = "+(a%b));
	}
}
