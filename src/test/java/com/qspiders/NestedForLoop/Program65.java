/* WAP to display the below pattern 

ABCDE
FGHIJ
KLMNO
PQRST
UVWXY
Z

*/

package com.qspiders.NestedForLoop;

public class Program65 {
	public static void main(String[] args) {
		char ch = 'A';
		for (int row = 1; row <= 6; row++) {
			for (int col = 1; col <= 5; col++) {
				if (ch >= 'A' && ch <= 'Z') {
					System.out.print(ch);
					ch++;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
