package logicalProgramsByPawan;

import java.util.Scanner;

public class CountOfDigitsOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		long num = sc.nextLong();
		long original_num = num;
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Number of digits present in " + original_num + " is :" + count);
	}
}
