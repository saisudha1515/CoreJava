package logicalProgramsByPawan;

import java.util.Scanner;

public class NumberOfEvenAndOddDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		// long num = sc.nextLong();
		int num = sc.nextInt();
		int orgNum = num;
		int even_Count, odd_Count;
		even_Count = 0;
		odd_Count = 0;
		while (num > 0) {  // num<0 means there is no digits in the number and also not >= only >
			// int rem = (int) (num%10);
			int rem = num % 10;
			if (rem % 2 == 0) {
				even_Count++;
			} else {
				odd_Count++;
			}
			num = num / 10;
		}
		System.out.println("Number of even Count present in " + orgNum + " is : " + even_Count);
		System.out.println("Number of odd Count present in " + orgNum + " is : " + odd_Count);

	}
}
