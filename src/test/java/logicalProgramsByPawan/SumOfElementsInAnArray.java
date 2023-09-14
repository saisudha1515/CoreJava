package logicalProgramsByPawan;

import java.util.Scanner;

public class SumOfElementsInAnArray {
	public static void main(String[] args) {
		int sum = 0;
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements into the array : ");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		for(int i = 0; i < num.length; i++) {
			sum = sum+num[i];
		}
		System.out.println("Sum of Array Elements is : "+sum);
	}
}
