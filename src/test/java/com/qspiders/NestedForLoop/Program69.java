/* WAP to display the below pattern 

A
AB
ABC
ABCD

*/

package com.qspiders.NestedForLoop;

public class Program69 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			char ch = 'A';
			for (char j = 1; j <= i; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
