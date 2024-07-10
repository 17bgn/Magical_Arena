
public class Ex1 {

	public static void main(String[] args) {
		String s1 = "Hello Java Programs";
		char a[]=s1.toCharArray();
		int left=0;
		int right=a.length-1;
		for(int i=0;i<a.length;i++) {
			if(a[left] !=32 && a[right]!=32) {
				char temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				left++;
				right++;
			}
		}
		
		
		

}
}