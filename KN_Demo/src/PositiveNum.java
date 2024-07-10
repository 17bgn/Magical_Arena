import java.util.Scanner;
public class PositiveNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("User! Enter a number");
		int num = s.nextInt();
		if(num>0)
		{
			System.out.println(num+ " is Postive number");
		}
		
		else{
			System.out.println(num+ " is Not Postive number");
		}
		
	}

}
