/* Switch Statement for Arithmetic Operator program...  */
package com.qspiders.SwitchCodition;

public class Program1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		char choice = '-';
		float result = 0.0f;
		switch (choice) {
		case '+':
			// System.out.println("Sum of "+num1+" & "+num2+" : "+(num1+num2));
			result = num1 + num2;
			System.out.println("Sum of " + num1 + " & " + num2 + " : " + result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println("Difference of " + num1 + " & " + num2 + " : " + result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println("Product of " + num1 + " & " + num2 + " : " + result);
			break;
		case '%':
			result = num1 % num2;
			System.out.println("Remainder of " + num1 + " & " + num2 + " : " + result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println("Quotient of " + num1 + " & " + num2 + " : " + result);
			break;
		default:
			System.out.println("Wrong choice! Kindky enter Arithmetic operator");
			break;
		}
	}
}
