
/* 
WAP to display the below pattern

1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5

*/

package com.qspiders.NestedWhileLoop;

public class Pattern3 {
	public static void main(String[] args) {
		int i = 1, num = 5;
		while (i <= num) {
			int j = 1;
			while (j <= num) {
				System.out.print(i + " ");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
