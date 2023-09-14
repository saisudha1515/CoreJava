/* WAP for the below pattern 
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4

*/
package com.qspiders.NestedForLoop;
public class Program6 {
	public static void main(String[] args) {
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 5; col++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}
	}
}
