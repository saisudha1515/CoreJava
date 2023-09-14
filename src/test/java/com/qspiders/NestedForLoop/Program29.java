/* Draw the below Pattern 

    1
   21
  321
 4321
54321


*/
package com.qspiders.NestedForLoop;

public class Program29 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				if (i >= j) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
