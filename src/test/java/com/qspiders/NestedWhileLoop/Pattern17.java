/* 
WAP to display the below pattern

11111
00000
11111
00000
11111

*/
package com.qspiders.NestedWhileLoop;

public class Pattern17 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 5) {
			int j = 1;
			while (j <= 5) {
				if (i % 2 == 0) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
