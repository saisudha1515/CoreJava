//Program to store 10 numbers and display the prime numbers     // WRONG 
package Arrays;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Store the elements into the array ");
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements stored in the array are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] % i == 0) {
				count++;
			}
			if (count == 2) {
				System.out.println(arr[i]);
			}
		}

		System.out.println("PrimeNumbers count is : " + count);
	}
}
