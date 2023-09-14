//Display Even numbers with in 1 to 100 
package com.qspider.WhileLoop;

public class WhileLoop5 {
	public static void main(String[] args) {
		// int i=1; unnecessarily loop will be executed for extra 1 time ...
		int i = 2;
		System.out.println("Even numbers with in 1 to 100 are: ");
		System.out.println("=======================================");
		while (i <= 100) {
			if (i % 2 == 0) {
				// System.out.print(i+" ");
				System.out.println(i);
			}
			i++;
		}
	}
}
