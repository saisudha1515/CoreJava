/* Draw the below Pattern 

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/

package com.qspiders.NestedForLoop;

public class Program13 {
	public static void main(String[] args) {
		int num = 5, count = 1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}

	// or

//	public static void main(String[] args) {
//		int count = 1;
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(count + " ");
//				count++;
//			}
//			System.out.println();
//		}
//	}

}
