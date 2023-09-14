
/* Draw the below Pattern 

 0  1  0  1  0
 1  0  1  0  1
 0  1  0  1  0
 1  0  1  0  1
 0  1  0  1  0


*/

package com.qspiders.NestedForLoop;

public class Program19 {
	public static void main(String[] args) {
		int num = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (num % 2 == 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
				num++;
			}
			System.out.println();
		}
	}
}
