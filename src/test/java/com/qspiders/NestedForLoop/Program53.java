/* WAP to display the below pattern 

*

*/


package com.qspiders.NestedForLoop;

public class Program53 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j && i == 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
