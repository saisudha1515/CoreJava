package com.qspiders.ForLoop;

public class ForLoop11 {
	public static void main(String[] args) {
		for (char i = 'A'; i <= 'Z'; i++) {
			if (i == 'A') {
				System.out.println("Uppercase Letters ");
				System.out.println("********************");
			}
			System.out.println(i);
		}
		for (char i = 'a'; i <= 'z'; i++) {
			if (i == 'a') {
				System.out.println("Lowercase Letters ");
				System.out.println("********************");
			}
			System.out.println(i);
		}
		for (int i = 1; i <= 100; i++) {
			if (i == 1) {
				System.out.println("Numbers From 1 to 100 ");
				System.out.println("********************");
			}
			System.out.println(i);
		}

//		 for(char i='A';i<='Z';i++){ if(i=='A'){ System.out.println();
//		  System.out.println(" Character and its ASCII Value ");
//		  System.out.println("************************");
//		  System.out.println(i+" | "+char(i)); } }
//		 
	}
}
