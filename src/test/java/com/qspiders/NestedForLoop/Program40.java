/* Draw the below ARROW Pattern 

  *
   *
*****
   *
  *

*/

package com.qspiders.NestedForLoop;

public class Program40 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i % 3 == 0 || j - i == 2 || i + j == 8) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
