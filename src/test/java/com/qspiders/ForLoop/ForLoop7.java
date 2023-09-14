/* WAP for first 10 multiples of 3 */
package com.qspiders.ForLoop;
public class ForLoop7 {
	public static void main(String[] args) {
		int num = 3;
		System.out.println("First 10 multiples of 3 ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
			// System.out.println(num*i);
		}
	}
}
