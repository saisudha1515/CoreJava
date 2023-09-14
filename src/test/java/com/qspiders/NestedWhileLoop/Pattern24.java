/* 
WAP to display the below pattern


1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

*/

package com.qspiders.NestedWhileLoop;

public class Pattern24 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 5) {
			int j = 5;
			while (j >= 1) {
				if (i >= j) {
					System.out.print(i + " ");
				}
				j--;
			}
			i++;
			System.out.println();
		}
	}
}
