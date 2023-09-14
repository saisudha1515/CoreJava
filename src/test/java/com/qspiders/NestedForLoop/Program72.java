/* WAP to display the below pattern 

ABCDE
ABCD
ABC
AB
A

*/
package com.qspiders.NestedForLoop;

public class Program72 {
	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			char ch = 'A';
			for (char j = 1; j <= i; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
