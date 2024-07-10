package com.kodnest.collections;
import java.util.*;

class Studen implements Comparable<Studen>{
	String name;
	int marks;
	public Studen(String name, int marks) {
		this.name = name;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return name+" "+marks;
	}
	@Override
	public int compareTo(Studen s) {
		if(this.marks > s.marks) {
			return 1;
		}else if(this.marks < s.marks) {
			return -1;
		}
		return 0;
	}
}
public class PQ4 {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name-1");
		String name1 = s.next();
		System.out.println("Enter the marks-1");
		int marks1 = s.nextInt();
		System.out.println("Enter the name-2");
		String name2 = s.next();
		System.out.println("Enter the marks-2");
		int marks2 = s.nextInt();
		System.out.println("Enter the name-3");
		String name3 = s.next();
		System.out.println("Enter the marks-3");
		int marks3 = s.nextInt();
		
		Studen s1 = new Studen(name1, marks1);
		Studen s2= new Studen(name2,marks2);
		Studen s3 = new Studen(name3,marks3);
		
		TreeSet ts = new TreeSet();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		Iterator i = ts.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		//System.out.println(ts);
		
		
		

	}

}
