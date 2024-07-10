package com.kodnest.strings;

public class FrequencyOfAllChars {

	public static void main(String[] args) {
		String a = "Apple";
		
		int [] cf=new int[255];
		for(char c:a.toCharArray()) {
			if(Character.isLetterOrDigit(c)) {
				cf[c]++;
			}
		}
		for(int i=0;i<cf.length;i++) {
			if(cf[i]>0) {
				System.out.println("Character: "+(char)i+" ,Frequnecy: "+cf[i]);
			}
		}
	}

}
