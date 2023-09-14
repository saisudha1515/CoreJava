/* 
WAP to display the below pattern

1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5

*/
package com.qspiders.NestedWhileLoop;

public class Pattern2 {
	public static void main(String[] args) {
		int i = 1, num = 5;
		while (i <= num) {
			int j = 1;
			while (j <= num) {
				System.out.print(j + " ");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
