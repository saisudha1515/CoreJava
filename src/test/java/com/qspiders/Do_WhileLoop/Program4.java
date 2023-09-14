//WAP to store a number and display sum of digits of a number (ex: 678 ==> sum of digits of a number is 6+7+8=21)
package com.qspiders.Do_WhileLoop;
public class Program4 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		do {
			int digit = num % 10;
			sum = sum + digit; // 8 8+3=11 8+3+5=16
			num = num / 10;
		} while (num != 0);
		System.out.println("Sum of digits of a number : " + sum);
	}
}
