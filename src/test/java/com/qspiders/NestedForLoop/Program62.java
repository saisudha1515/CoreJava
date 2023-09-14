/* WAP to display the below pattern

    1
   11
  111
 1111
11111

*/

package com.qspiders.NestedForLoop;

public class Program62 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				if (i >= j) {
					System.out.print("1");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
//================

//	class Program26 {
//		public static void main(String[] args) {
//			for (int i = 1; i <= 5; i++) {
//				// for(int j=4;j>=1;j--)
//				for (int j = 4; j >= i; j--) {
//					System.out.print(" ");
//				}
//				for (int k = 1; k <= i; k++) {
//					System.out.print("1");
//
//				}
//				System.out.println();
//			}
//		}
//	}


}
