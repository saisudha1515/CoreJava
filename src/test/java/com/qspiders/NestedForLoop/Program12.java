/* Draw the below Pattern 


1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/

package com.qspiders.NestedForLoop;

public class Program12 {
	public static void main(String[] args) {
		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i >= j) {
					System.out.print(j + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	// or

//	public static void main(String[] args) {
//		int num = 5;
//		for (int i = 1; i <= num; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//	}

}
