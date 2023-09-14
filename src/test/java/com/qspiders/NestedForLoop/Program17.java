/* Draw the below Pattern   //// take 2 columns as a single column so,here 6 columns will become 3 columns...

1 1 2 1 3 1
1 2 2 2 3 2
1 3 2 3 3 3
1 4 2 4 3 4
1 5 2 5 3 5

*/

package com.qspiders.NestedForLoop;

public class Program17 {
	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 3; col++) {
				System.out.print(col + " " + row + " ");
			}
			System.out.println();
		}
	}
}
