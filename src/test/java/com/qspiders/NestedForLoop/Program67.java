/* WAP to display the below pattern 

AAAAA
BBBBB
CCCCC
DDDDD
EEEEE

*/
package com.qspiders.NestedForLoop;

public class Program67 {
	public static void main(String[] args) {
		char ch = 'A';
		for (int row = 1; row <= 5; row++) {
			for (int col = 5; col >= 1; col--) {
				System.out.print(ch);
			}
			ch++;
			System.out.println();
		}
	}
}
