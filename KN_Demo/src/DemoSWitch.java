import java.util.Scanner;
public class DemoSWitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! Please enter number-1");
		int a = scan.nextInt();
		System.out.println("User! Please enter number-2");
		int b = scan.nextInt();
		System.out.println("User! Please enter the Operator");
		//char ch = scan.next().charAt(0);
		int ch=scan.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		case 5:
			System.out.println(a%b);
			break;
		default :
			System.out.println("Invalid operator");
		}

	}

}
