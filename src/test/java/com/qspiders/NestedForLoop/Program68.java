/* WAP to display the below pattern 

AAAAA
BBBBB
CCCCC
DDDDD
EEEEE

*/
package com.qspiders.NestedForLoop;

public class Program68 {
	public static void main(String[] args) {
		for (char ch = 'A'; ch <= 'E'; ch++) {
			for (char j = 'a'; j <= 'e'; j++)
			// for(int j=1;j<=5;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
