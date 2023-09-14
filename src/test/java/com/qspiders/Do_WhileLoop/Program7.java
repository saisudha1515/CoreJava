//WAP to store a number and generate its REVERSE NUMBER  
package com.qspiders.Do_WhileLoop;
public class Program7 {
	public static void main(String[] args) {
		int num = 12345,original=num;
		int reverse = 0;
		int digit;
		do {
			digit = num % 10;
			reverse = reverse * 10 + digit; // formula for a reverse number....
			num = num / 10;
		} while (num != 0);
		System.out.println("Actual Number is : " + original);
		System.out.println("Reverse Number is : " + reverse);

		//// here the digit can't be printed because the digit variable is declared in
		//// side do loop. that declaration is alive only for that loop only outside of
		//// the loop in not applicable...if we declared at method level we can access
		//// in whole method....

	}
}
