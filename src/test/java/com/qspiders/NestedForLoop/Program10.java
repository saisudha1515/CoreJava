/* WAP for the below pattern

1 3 5 7 9
11 13 15 17 19
21 23 25 27 29
31 33 35 37 39
41 43 45 47 49

*/
package com.qspiders.NestedForLoop;

public class Program10 {
	public static void main(String[] args) {
		int count = 1;
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				System.out.print(count + " ");
				count += 2;
			}
			System.out.println();
		}
	}
}
