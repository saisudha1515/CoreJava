/* WAP for the below pattern

2 4 6 8 10
12 14 16 18 20
22 24 26 28 30
32 34 36 38 40
42 44 46 48 50

*/
package com.qspiders.NestedForLoop;

public class Program9 {
	public static void main(String[] args) {
		int count = 2;
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				System.out.print(count + " ");
				count += 2;
			}
			System.out.println();
		}
	}
}
