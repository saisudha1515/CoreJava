/*  WAP for the below pattern 


 *  *  *  *
 *  *  *  *
 *  *  *  *

*/
package com.qspiders.NestedForLoop;
public class Program3 {
	public static void main(String[] args) {
		for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 4; col++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
