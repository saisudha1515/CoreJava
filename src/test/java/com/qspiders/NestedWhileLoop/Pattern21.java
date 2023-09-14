/* 
WAP to display the below pattern

5 4 3 2 1
5 4 3 2
5 4 3
5 4
5

*/

package com.qspiders.NestedWhileLoop;

public class Pattern21 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 5) {
			int j = 5;
			while (j >= 1) {
				if (i <= j) {
					System.out.print(j + " ");
				} else {
					System.out.print(" ");
				}
				j--;
			}
			i++;
			System.out.println();
		}
	}
}
