//WAP to display the digits of a number 
package com.qspiders.Do_WhileLoop;
public class Program2 {
	public static void main(String[] args) {
		int num = 455;
		int count = 0;
		do {
			int digit = num % 10;
			count++;
			num = num / 10;
		} while (num != 0);
		System.out.println("Number of digits : " + count);
	}
}
