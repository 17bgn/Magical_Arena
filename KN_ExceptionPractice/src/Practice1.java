import java.util.InputMismatchException;
import java.util.Scanner;
public class Practice1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		try {
		int a = (Integer) null;//s.nextInt();
		int ar[]=new int[a];
		System.out.println("Enter the Elements into the Array"); 
		for(int i=0;i<ar.length;i++) {
			ar[i]=s.nextInt();
		}
		for(int i:ar) {
			System.out.print(i+" ");
		}
		System.out.println("\nUser please enter the index");
					int in=s.nextInt();
					System.out.println("index "+in+" element is "+ar[in]);
			
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("User! Please Enter the index number within the Array Size.");
		}
		catch(InputMismatchException ime) {
			System.out.println("User! Please enter the data in integer datatype.");
		}
		catch(NegativeArraySizeException nae) {
			System.out.println("User! please enter the Positive Array size");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			s.close();
		}
		

	}

}
