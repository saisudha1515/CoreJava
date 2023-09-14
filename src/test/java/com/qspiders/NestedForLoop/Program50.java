/* Draw the below Pattern 

10001
00000
00000
00000
10001

*/

package com.qspiders.NestedForLoop;

public class Program50 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if ((i == 1 || i == 5) && i + j == 6 || (i == 1 || i == 5) && i == j) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
	// another condition :: if(i==1&&j==1||i==1&&j==5 || i==5&&j==1 || i==5&&j==5)
}
