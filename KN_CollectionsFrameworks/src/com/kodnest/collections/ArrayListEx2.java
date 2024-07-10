package com.kodnest.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1{
	int id;
	String name;
	public Student1(int id, String name) {
		this.id=id;
		this.name = name;
	}
	public String toString() {
		return id+" - "+name;
	}
	/*@Override
	public int compareTo(Student1 s) {
		if(this.name.compareTo(s.name)>0) {
			return 1;
		}else if(this.name.compareTo(s.name)<0) {
			return -1;
		}
		return 0;
	}*/
	
}
class Sorting implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		if(o1.id > o2.id) {
			return 1;
		}else if(o1.id < o2.id) {
			return -1;
		}
		return 0;
	}
	
}
 
public class ArrayListEx2 {

	public static void main(String[] args) {
		Student1 s1= new Student1(17,"e");
		Student1 s2 = new Student1(15,"a");
		Student1 s3= new Student1(24,"d");
		Student1 s4= new Student1(21,"b");
		Student1 s5= new Student1(18,"c");
		
		ArrayList<Student1> al = new ArrayList<Student1>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		System.out.println(al);
		System.out.println();
		Collections.sort(al,new Sorting());
		Collections.sort(al,new Comparator<Student1>(){

			@Override
			public int compare(Student1 o1, Student1 o2) {
					if(o1.id > o2.id) {
						return 1;
					}else if(o1.id < o2.id) {
						return -1;
					}
					return 0;
			}
			
		});
		System.out.println(al);
		
		
		
		
	}

}
