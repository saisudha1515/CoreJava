// Write a program to store 10 elements and display duplicate elements.. and also display the count of duplicate elements..(for this count we need to take one counter variable called count..)
package Arrays;

import java.util.Scanner;

public class DuplicateElemenets {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements into the array : ");
		int num[] = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("The Duplicate elements stored in the array are : ");
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]); // System.out.println(num[j]); can print num[i] or num[j] because we are printing values only when i==j
					count++;
				}
			}
		}
		System.out.println("The count of duplicate elements in the array : " + count);
	}
}
