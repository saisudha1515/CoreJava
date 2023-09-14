//Display where a number is Prime or not  
package com.qspider.WhileLoop;

public class WhileLoop8 {
	public static void main(String[] args) {
		int i = 1;
		int num = 73;
		int count = 0;
		System.out.println("factors of " + num + " are: ");
		System.out.println("=========================");
		while (i <= num) {
			if (num % i == 0) {
				System.out.println(i);
				count++;
			}
			i++;
		}
		System.out.println();
		System.out.println(num + " factors count is : ");
		System.out.println("============================");
		System.out.println(count);
		System.out.println();
		if (count == 2) {
			System.out.println(num + " is a Prime ");
		} else {
			System.out.println(num + " is not a Prime ");
		}
	}
}
