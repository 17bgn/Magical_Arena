package com.kodnest.strings;

public class Day55Nov16 {

	public static void main(String[] args) {
		String s = "india newzealand";
		String sp[] =s.split(" ");
		for(int i=0;i<sp.length;i++) {
			System.out.print((sp[i].charAt(0)+"").toUpperCase());
			System.out.print(sp[i].substring(1));
			System.out.println();
		}
	}

}