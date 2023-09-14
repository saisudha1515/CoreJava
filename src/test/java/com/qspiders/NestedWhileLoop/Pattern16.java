/* 
WAP to display the below pattern

1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

*/
package com.qspiders.NestedWhileLoop;

public class Pattern16 {

	public static void main(String[] args) {
		int i = 1, num = 5, count = 1;
		while (i <= num) {
			int j = 1;
			while (j <= num) {
				System.out.print(count + " ");
				count++;
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
