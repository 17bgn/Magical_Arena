package com.kodnest.strings;

public class StringSort {

	public static void main(String[] args) {
		String[] s={"Java","Python","at","Mt"};
		
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].compareTo(s[j])>0) {
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for(String sort: s) {
			System.out.println(sort);
		}
	}

}
