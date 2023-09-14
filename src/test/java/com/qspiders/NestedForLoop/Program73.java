/* WAP to display the below pattern

A B C D E
1 2 3 4 5
A B C D E
1 2 3 4 5
A B C D E


*/

package com.qspiders.NestedForLoop;

public class Program73 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			char ch = 'A';
			for (int j = 1; j <= 5; j++) {
				if (i % 2 == 0) {
					System.out.print(j + " ");
				} else {
					System.out.print(ch + " ");
					ch++;
				}
			}
			System.out.println();
		}
	}
}
