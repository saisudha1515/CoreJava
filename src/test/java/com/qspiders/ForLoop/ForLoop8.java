/* WAP to dispaly factorial of any number */
//Take 1 in case of MULTIPLICATION and take 0 in case if SUM(0* anything becomes 0 so should not take 0 for multiplications) */
package com.qspiders.ForLoop;
public class ForLoop8 {
	public static void main(String[] args) {
		int factorial = 1;
		int num = 9;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
			// System.out.println("Factorial of "+num+" is "+factorial);
		}
		System.out.println("Factorial of " + num + " is " + factorial);
	}
}
