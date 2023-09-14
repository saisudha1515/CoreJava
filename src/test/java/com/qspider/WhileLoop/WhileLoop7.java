//Display odd numbers with in 100 to 1
package com.qspider.WhileLoop;

public class WhileLoop7 {
	public static void main(String[] args) {
		// int i=100; unnecessarily loop will be executed for extra 1 time , take 99
		// because odd number starts from 99 ...
		int i = 99;
		System.out.println("Odd numbers with in 100 to 1 are: ");
		System.out.println("=======================================");
		while (i >= 1) {
			if (i % 2 != 0) {
				// System.out.print(i+" ");
				System.out.println(i);
			}
			i--;
		}
	}
}
