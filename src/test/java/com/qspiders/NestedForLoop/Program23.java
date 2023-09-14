/* Draw the below Pattern //////////// Wrong.....

A
B C
D E F
G H I J
K L M N O

*/

package com.qspiders.NestedForLoop;

public class Program23 {
	public static void main(String[] args) {
		char ch = 'A';
		int count = 'A';
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
				count++;
			}
			System.out.println();
		}
	}
}
