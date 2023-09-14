/* WAP to display the below pattern   ///////////////// if column is even then print 0, if column is not even then print 1

1  0  1  0  1
1  0  1  0  1
1  0  1  0  1
1  0  1  0  1
1  0  1  0  1

*/

package com.qspiders.NestedForLoop;

public class Program58 {
	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if (col % 2 == 0) {
					System.out.print(" 0 ");
				} else {
					System.out.print(" 1 ");
				}
			}
			System.out.println();
		}
	}
}
