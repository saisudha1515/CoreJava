/* 
WAP to display the below pattern

*****
** **
* * *
** **
*****

*/


package com.qspiders.NestedWhileLoop;

public class Pattern19 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 5) {
			int j = 1;
			while (j <= 5) {
				if (i == 1 || i == 5 || j == 1 || j == 5 || i == j || i + j == 6) {
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
