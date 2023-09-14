//Factorial of any number 
package com.qspider.WhileLoop;

public class WhileLoop10 {
	public static void main(String[] args) {
		int i = 1; // initialization
		int num = 10;
		int factor = 1;
		while (i <= num) // condition
		{
			factor = factor * i;
			i++; // update (or) increment
		}
		System.out.println(num + " factorial is : " + factor);
	}
}
