package com.qspider.WhileLoop;

public class WhileLoop11 {
	public static void main(String[] args) {
		int i = 1, num = 5, j = 1;
		while (i <= num) {
			while (j <= num) {
				System.out.print(j + " ");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
