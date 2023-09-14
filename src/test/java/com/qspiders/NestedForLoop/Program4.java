/* WAP for the below pattern 

1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5

*/
package com.qspiders.NestedForLoop;

public class Program4 {
	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}
