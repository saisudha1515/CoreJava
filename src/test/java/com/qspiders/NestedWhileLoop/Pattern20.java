/* 
WAP to display the below pattern

11111
1111
111
11
1

*/
package com.qspiders.NestedWhileLoop;

public class Pattern20 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 5) {
			int j = 5;
			while (j >= 1) {
				if (i <= j) {
					System.out.print("1");
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
