import java.util.Scanner;
public class ApplicationSA {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a name");
		String name = s.nextLine();
		System.out.println("Enter age");
		int age = s.nextInt();
		System.out.println("Enter the Address");
		s.nextLine();
		String address = s.nextLine();
		System.out.println("\n1st Person Details");
		StudentAssignment sa = new StudentAssignment(name,age,address);
		System.out.println("Name = "+sa.name);
		System.out.println("Age = "+sa.age);
		System.out.println("Address = "+sa.address);
		System.out.println("\nEnter a name");
		String name1 = s.nextLine();
		System.out.println("Enter age");
		int age1 = s.nextInt();
		System.out.println("Enter the Address");
		s.nextLine();
		String address1 = s.nextLine();
		System.out.println("\n2nd Person Details");
		StudentAssignment sa1 = new StudentAssignment(name1,age1,address1);
		System.out.println("Name = "+sa1.name);
		System.out.println("Age = "+sa1.age);
		System.out.println("Address = "+sa1.address);
	}
}
