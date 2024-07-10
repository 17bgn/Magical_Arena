import java.util.Scanner;
public class EventId {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Fill code here 
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your ID");
		String id = sc.nextLine();
		if(!valid(id)){
		    System.out.println(id+" is an invalid ID");
		}else{
		    int seat = Integer.parseInt(id.substring(3,6));
		    int time = Integer.parseInt(id.substring(6,8));
		    String std = id.substring(8);
		    
		    System.out.println("Hi "+name+" your seat number is "+seat+" and the event starts at "+time+""+std);
		    return;
		}
	}
	public static boolean valid(String id){
	    return id.matches("SPC\\d{3}(0[1-9]|1[0-2])(AM|PM)");
	}
}
