import java.util.Scanner;
public class MethodHW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		double num = sc.nextDouble();
		//double result = square(num);
		System.out.println("Square of the num = "+square(num));
	}
	public static double square(double a)
	{
		return a*a;
	}

}
