/* WAP to display even numbers from 1 to 100 */
package com.qspiders.ForLoop;
public class ForLoop5 {
	public static void main(String[] args) {
		// APPROACH :1 Here the performance is high because the loop will repeat only
		// for 50 times and here the count is 2

		System.out.println("Odd Numbers from 1 to 100 are : ");
		System.out.println("===================================");
		for (int count = 2; count <= 100; count += 2) {
			System.out.println(count);
			// System.out.print(count+" ");
		}

		// APPROACH : 2 Here the performance is low because the compiler has to check
		// all 100 numbers. 100 times the loop will repeat.. and here the count is 1

		System.out.println("1 to 100 odd numbers are ::");
		System.out.println("################################################");
		for (int num = 2; num <= 100; num++) {
			if (num % 2 == 0)
				System.out.println(num);
		}
	}
}
