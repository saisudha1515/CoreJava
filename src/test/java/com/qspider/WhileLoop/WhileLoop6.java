//Display Even numbers with in 1 to 50 
package com.qspider.WhileLoop;

public class WhileLoop6 {
	public static void main(String[] args) {
		int i = 1;
		System.out.println("Odd numbers with in 1 to 50 are: ");
		System.out.println("=======================================");
		while (i <= 99) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
				// System.out.println(i);
			}
			i++;
		}
	}
}
