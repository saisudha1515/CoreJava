/* WAP for first 10 multiples of any number */
package com.qspiders.ForLoop;
public class ForLoop6 {
	public static void main(String[] args) {
		int num = 250;
		System.out.println("First 10 multiples of " + num);
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
			// System.out.println(num*i);
		}
	}
}
