/* Draw the below Pattern 
    1
   12
  123
 1234
12345

*/

package com.qspiders.NestedForLoop;

public class Program35 {
	public static void main(String[] args) {
		int count = 1, space = 4;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= count; k++) {
				System.out.print(k);
			}
			System.out.println();
			count++;
			space--;
		}
	}
}
