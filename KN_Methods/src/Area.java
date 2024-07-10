import java.util.Scanner;
public class Area {

	public static void calculateArea(int side) {
		System.out.println("Area of Square = side * side");
		System.out.println("Side = "+side);
		System.out.println("Square Area = "+(side * side)+"sq.cm");
	}
	public static void calculateArea(int length, int width) {
		System.out.println("Area of Rectangle = Length * Width");
		System.out.println("length = "+length+" Width = "+width);
		System.out.println("Rectangle Area = "+(length * width)+"cm²");
	}
	public static void calculateArea(double radius) {
		System.out.println("Area of the Circle = 3.14 * radius²");
		System.out.println("Radius = "+radius);
		double area = 3.14 * (radius * radius);
		System.out.println("Circle Area = "+ area+"cm²");
	}
	public static void calculateArea(double sideLength, double slantHeight) {
		System.out.println("Surface area of Square Pyramid = 2bs + b²");
		double area = (2) * (sideLength * slantHeight) + (sideLength * sideLength);
		System.out.println("Square Pyramid area = "+area+"cm²");}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("\nEnter a int number");
		int a =s.nextInt();//120
		calculateArea(a);
		System.out.println("\nEnter a int number");
		int b = s.nextInt();//15
		System.out.println("Enter a int number");
		int c = s.nextInt();//4
		calculateArea(b,c);
		System.out.println("\nEnter a double number");
		double d = s.nextDouble();//6.0
		calculateArea(d);
		System.out.println("\nEnter a double number");
		double e = s.nextDouble();//4.0
		System.out.println("Enter a double number");
		double f = s.nextDouble();//8.0
		calculateArea(e,f);
	}
}
/*calculatedArea(120);
  calculatedArea(15,4);
  calculatedArea(6.0);
  calculatedArea(4.0,8.0);*/
