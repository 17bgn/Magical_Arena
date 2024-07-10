import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the percentage");
		double per = sc.nextDouble();
		char grade ;
		switch ((int)per/10) 
		{	
		case 9,10:
			grade = 'A';
		System.out.println("Grade = "+grade);
		
		break;
		case 7,8:
			grade = 'B';
		System.out.println("Grade = "+grade);
		break;
		case 5,6:
			grade = 'c';
		System.out.println("Grade = "+grade);
		break;
		case 3,4:
			grade = 'D';
		System.out.println("Grade = "+grade);
		break;
		default :
			grade = 'F';
			System.out.println("Grade = "+grade);
		}


	}
}
/*switch(8){
case 1:
case 2:
case 3:
case 4:
case 5:System.out.println("Number is 1-5");break;
case 6: 
case 7:
case 8:
case 9:
case 10:System.out.println("Number is 1-10");break;
default: System.out.println("Out of Range");	
}*/