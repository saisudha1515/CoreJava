/* Draw the below Pattern 

A A A A A
A B C D E
C C C C C
A B C D E
E E E E E


*/

package com.qspiders.NestedForLoop;

public class Program31 {
	public static void main(String[] args) {
		int n = 1;
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= 'E'; j++) {
				if (n % 2 == 0) {
					System.out.print(j + " ");
				} else {
					System.out.print(i + " ");
				}
			}
			n++;
			System.out.println();
		}
	}
}
