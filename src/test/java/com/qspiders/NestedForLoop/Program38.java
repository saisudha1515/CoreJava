/* Draw the below Pattern 

    *
   * *
  * * *
 * * * *
* * * * *


*/

package com.qspiders.NestedForLoop;

public class Program38 {
	public static void main(String[] args) {
		int count = 1, space = 4;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= count; k++) {
				System.out.print("* ");
			}
			System.out.println();
			count++;
			space--;
		}
	}
}
