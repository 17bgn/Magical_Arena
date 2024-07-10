import java.util.Scanner;
public class PasswordValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Fill code here 
		System.out.println("Generate your password");
		String pass = sc.nextLine();
		if(!isValid(pass)){
		    System.out.println(pass+" is an invalid password");
		    return;
		}else{
		    int lc=0,up=0,ss=0,dg=0;
		    for(char ch:pass.toCharArray()){
		        if(Character.isLowerCase(ch)){
		            lc++;
		        }else if(Character.isUpperCase(ch)){
		            up++;
		        }else if("@$#*".indexOf(ch)!=-1){
		            ss++;
		        }else if(Character.isDigit(ch)){
		            dg++;
		        }
		    }
		    System.out.println("The Generated password "+pass+" is valid and has "+lc+" lowercase alphabet "+up+" uppercase alphabet "+ss+" special character "+dg+" digit");
		    return;
		}
	}
	public static boolean isValid(String pass){
	    return pass.length()>=6 && pass.length()<=12 && containsLUDS(pass);
	}
	public static boolean containsLUDS(String pass){
	    boolean f1 = pass.matches(".*[a-z].*");
	    boolean f2 = pass.matches(".*[A-Z].*");
	    boolean f3 = pass.matches(".*[@$*#].*");
	    boolean f4 = pass.matches(".*\\d.*");
	    
	    return f1 && f2 && f3 && f4;
	}

}
