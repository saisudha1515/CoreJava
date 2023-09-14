//WAP to display the count of digits of a number  
package com.qspiders.Do_WhileLoop;
public class Program1 {
	public static void main(String[] args) {
		int num = 5698;
		int count = 0;
		do {
			int digit = num % 10; // gives the last digit of the number
			count++;
			num = num / 10; // removes the last digit from the number i dont want the last digit for next
							// iteration..
		} while (num > 0);
		System.out.println("Digits of a number in reverse order : " + count);
	}
}
