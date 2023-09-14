/* WAP to display the below pattern 

1   5
 2 4
  3
 2 4
1   5

*/

package com.qspiders.NestedForLoop;

public class Program64 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i + j == 6 || i == j) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
