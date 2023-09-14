//WAP to store a number and display the difference between product of the digit and sum of the digit
package com.qspiders.Do_WhileLoop;
public class Program6 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		int product = 1;
		int difference;
		do {
			int digit = num % 10;
			sum = sum + digit; // 0+5=5 5+4=9 9+3=12 12+2=14 14+1=15
			product = product * digit; // 1*5=5 5*4=20 20*3=60 60*2=120 120*1=120
			// difference = product-sum; // 120-15=105
			num = num / 10;
		} while (num != 0);
		difference = product - sum;
		System.out.println("Product of a number is                            : " + product);
		System.out.println("Sum of a number is                                : " + sum);
		System.out.println("Difference between Sum and Product of a number is : " + difference);
	}
}
