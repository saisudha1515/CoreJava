/* WAP to display the below pattern 

1   1
 2 2
  3
 4 4
5   5

*/

package com.qspiders.NestedForLoop;

public class Program63 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i + j == 6 || i == j) {
					System.out.print(i);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
