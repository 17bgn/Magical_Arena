
public class DisneyChaiMO {

	public static void getBill() {
		System.out.println("\nThe bill is ₹10"); }
	public static void getBill(int quantity) {
		System.out.println("\nThe bill is ₹"+(10*quantity)); }
	public static void getBill(String type) {
		System.out.println("\nThe bill for "+type+" is ₹20"); }
	public static void getBill(int quantity, String type) {
		System.out.println("\nThe bill for "+quantity+" - "+type+" is ₹"+(20*quantity));}
	public static void getBill(int a,String t1,int b, String t2) {
		System.out.println("\nthe bill for "+a+" - "+t1+" is ₹"+(20*a));
		System.out.println("the bill for "+b+" - "+t2+" is ₹"+(20*b));
	}
	public static void main(String[] args) {
		System.out.println();
		getBill();
		getBill(4);
		getBill("Masala Chai");
		getBill(4,"Masala Chai");
		getBill(2,"HoneyChai",3,"MasalChai");
	}

}

