/* 
WAP to display the below pattern

  *
  *
*****
  *
  *

*/
package com.qspiders.NestedWhileLoop;

public class Pattern12 {
	public static void main(String[] args) {
		int i = 1, num = 5;
		while (i <= num) {
			int j = 1;
			while (j <= num) {
				if (j == 3 || i == 3) {
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
