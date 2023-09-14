/* 
WAP to display the below pattern

*****
   *
  *
 *
*****

*/
package com.qspiders.NestedWhileLoop;

public class Pattern9 {
	public static void main(String[] args) {
		int i = 1, num = 5;
		while (i <= num) {
			int j = 1;
			while (j <= num) {
				if (i == 1 || i == 5 || i + j == 6) {
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
