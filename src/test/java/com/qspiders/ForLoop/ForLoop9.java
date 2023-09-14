/* WAP to dispaly factors of any number */

//Take 1 in case of MULTIPLICATION and take 0 in case if SUM(0* anything becomes 0 so should not take 0 for multiplications) */

//Only if condition we can write but else should follow if. with out IF  we can not write else block.....but with out else we can write if block.....

package com.qspiders.ForLoop;

public class ForLoop9 {
	public static void main(String[] args) {
		int num = 8;
		System.out.println(num + " factors are ::");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}
}
