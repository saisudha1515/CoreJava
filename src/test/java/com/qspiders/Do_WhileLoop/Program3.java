//WAP to display the digits of a number in REVERSE ORDER 
package com.qspiders.Do_WhileLoop;
public class Program3 {
	public static void main(String[] args) {
		int num = 12345;
		do {
			int digit = num % 10;
			System.out.print(digit + " ");
			// System.out.println(digit+" ");
			num = num / 10;
		} while (num != 0);
	}
}
