package logicalProgramsByPawan;

import java.util.Scanner;

public class ExtractEven_And_OddNumbersInAnArray {
	public static void main(String[] args) {
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements into the array : ");
		int even_Count = 0, odd_Count = 0;
		// Increase the even and odd numbers count while storing into the array itself:: 
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if (num[i] % 2 == 0) {
				even_Count++;
			} else {
				odd_Count++;
			}
		}
		// Display the array elements :
		for(int i = 0;i<num.length;i++) {
			System.out.println(num[i]);
		}

		// extract Even Numbers :
		System.out.println("Even numbers in the array are : ");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.println(num[i]);
			}
		}
		// extract Odd Numbers :
		System.out.println("Odd numbers in the array are : ");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				System.out.println(num[i]);
			}
		}
		System.out.println("Even numbers count in the array is : " + even_Count);
		System.out.println("Odd numbers count in the array is : " + odd_Count);

	}
}
