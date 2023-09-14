/* Draw the below Pattern 


*
**
***
****
*****


*/

package com.qspiders.NestedForLoop;

public class Program11 {
//	public static void main(String[] args) {
//	int num = 5;
//	for (int i = 1; i <= num; i++) {
//		for (int j = 1; j <= num; j++) {
//			if (i >= j) {
//				System.out.print("*");
//			} else {
//				System.out.print(" ");
//			}
//		}
//		System.out.println();
//	}
//}

// or 

	public static void main(String[] args) {
		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
