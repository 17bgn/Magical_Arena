import java.util.Scanner;
public class EligibleVote {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = s.nextInt();
		if(age >= 18)
			System.out.println(age+" is Eligible to Vote");
		
	}

}
