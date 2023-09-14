//WAP to store a number and display the product of the digits
package com.qspiders.Do_WhileLoop;
public class Program5 {
	public static void main(String[] args) {
		int num = 12345;
		int product = 1;
		System.out.println("The product of the digits of a number is : ");
		System.out.println("===========================================");
		do {
			int digit = num % 10;
			product = product * digit; // 1*5=5 5*4=20 20*3=60 60*2=120 120*1=120
			// System.out.print(product+" ");
			System.out.println(product + " ");
			num = num / 10;
		} while (num != 0);
		// System.out.println("Product of digits of a number : "+product);
	}
}
