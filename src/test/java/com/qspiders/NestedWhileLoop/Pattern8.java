/* 
WAP to display the below pattern

*   *
 * *
  *
 * *
*   *

*/

package com.qspiders.NestedWhileLoop;

public class Pattern8 {
	public static void main(String[] args) {
		int i = 1, num = 5;
		while (i <= num) {
			int j = 1;
			while (j <= num) {
				if (i + j == 6 || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
