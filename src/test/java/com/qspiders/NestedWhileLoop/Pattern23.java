/* 
WAP to display the below pattern

*
**
***
****
*****

*/
package com.qspiders.NestedWhileLoop;

public class Pattern23 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 5) {
			int j = 5;
			while (j >= 1) {
				if (i >= j) {
					System.out.print("*");
				}
				j--;
			}
			i++;
			System.out.println();
		}
	}
}
