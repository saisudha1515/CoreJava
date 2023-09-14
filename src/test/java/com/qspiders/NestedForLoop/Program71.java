/* WAP to display the below pattern 

AAAAA
AAAA
AAA
AA
A
*/

package com.qspiders.NestedForLoop;

public class Program71 {
	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			char ch = 'A';
			for (char j = 1; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
