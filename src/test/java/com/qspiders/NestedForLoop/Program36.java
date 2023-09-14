/* Draw the below Pattern 

    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5


*/

package com.qspiders.NestedForLoop;

public class Program36 {
	public static void main(String[] args) {
		int count = 1, space = 4;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= count; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
			count++;
			space--;
		}
	}
}
