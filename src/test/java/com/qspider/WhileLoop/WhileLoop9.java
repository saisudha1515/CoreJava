//Display count and factors of a number 
package com.qspider.WhileLoop;

public class WhileLoop9 {
	public static void main(String[] args) {
		int i = 1, num = 73, count = 0;

		/* Various Ways to declare Variables::
		 * int i,num,count; i=1;num=73;count=0; 
		 * int i,num,count; i=1; num=73; count=0;
		 * int i=1; int num=73; int count=0;
		 */

		System.out.println("factors of " + num + " are: ");
		while (i <= num) {
			if (num % i == 0) {
				System.out.println(i);
				count++;
			}
			i++;
		}
		System.out.println();
		System.out.println(num + " factors count is : " + count);
	}
}
