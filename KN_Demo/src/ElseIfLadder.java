import java.util.Scanner;
public class ElseIfLadder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("User! Please Enter number-1");
		int a = s.nextInt();
		System.out.println("User! Please Enter number-2");
		int b = s.nextInt();
		System.out.println("User! Please Enter character");
		char ch = s.next().charAt(0);
		if(ch == '+')
		{
			System.out.println(a+b);
		}
		else if(ch == '-')
		{
			System.out.println(a-b);
		}
		else if(ch == '*')
		{
			System.out.println(a*b);
		}
		else if(ch == '/')
		{
			System.out.println(a/b);
		}
		else if(ch == '%')
		{
			System.out.println(a%b);
		}
		else
		{
			System.out.println("Invalid operator");
		}
		s.close();
		
	}

}
