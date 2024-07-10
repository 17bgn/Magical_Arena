import java.util.Scanner;
public class ShopNest {

	public static void main(String[] args) {
		shop();
	}
	static void  shop(){
		try {
			pay();
			System.out.println("Thank you for Shopping");
		}
		catch(Exception ex) {
			System.out.println("Shopping not completed try again..");
			//throw ex;
		}
	}
	public static void pay() throws Exception {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Plase Enter the Amount");
			int amt = s.nextInt();
			System.out.println("Payment Successful - INR "+amt);
		}
		catch(Exception ex) {
			System.out.println("Payment not completed");
			//throw ex;
		}
	}

}
