/* Draw the below Pattern 

    1
   2 1
  3 2 1
 4 3 2 1
5 4 3 2 1

*/

package com.qspiders.NestedForLoop;

public class Program28 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				if (i >= j) {
					System.out.print(j + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
