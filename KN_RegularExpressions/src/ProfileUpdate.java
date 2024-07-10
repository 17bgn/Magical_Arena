import java.util.*;
public class ProfileUpdate {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Fill code here 
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your PAN number");
		String pan = sc.nextLine();
		if(!validPan(pan)){
		    System.out.println(pan+" is an invalid PAN number");
		    return;
		}
		System.out.println("Enter your E-mail ID");
		String email = sc.nextLine();
		if(!validEmail(email)){
		    System.out.println("Invalid E-mail ID");
		    return;
		}
		System.out.println("Profile of "+name+" updated successfully");
	}
	public static boolean validPan(String pan){
	    return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]");
	}
	public static boolean validEmail(String email){
	    return email.matches("[a-z]{5,10}@digitec.com");
	}
	
}








