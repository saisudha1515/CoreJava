/* 
WAP to display the below pattern

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5


*/

package com.qspiders.NestedWhileLoop;

public class Pattern13 {
	public static void main(String[] args) {
		int i = 1, num = 5;
		while (i <= num) {
			int j = 1;
			while (j <= i) {
				System.out.print(j + " ");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
