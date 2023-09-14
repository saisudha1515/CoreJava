//Display First 10 multiples of any number 
package com.qspider.WhileLoop;

public class WhileLoop4 {
	public static void main(String[] args) {
		int i = 1;
		int num = 8;
		System.out.println("First 10 multiples of " + num + " are :");
		System.out.println("=======================================");
		while (i <= 10) {
			// System.out.print(num*i+" ");
			System.out.println(num + " X " + i + " = " + (num * i));
			i++;
		}
	}
}
