/* Draw the below Pattern 

5 4 3 2 1
5 4 3 2
5 4 3
5 4
5

*/

package com.qspiders.NestedForLoop;

public class Program26 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
