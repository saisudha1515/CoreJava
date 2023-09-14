/* Draw the below Pattern 

A B C D E
A B C D E
A B C D E
A B C D E
A B C D E


*/

package com.qspiders.NestedForLoop;

public class Program20 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			char ch = 'A';
			for (int j = 1; j <= 5; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
}
