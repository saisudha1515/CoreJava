// Write a program to check whether the given number is Even or not ?
package AssignmentPrograms_Set1;

import java.util.Scanner;

public class Check_Even_Or_Odd_Number {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is Even or Odd Number : ");
		num = sc.nextInt();
		checkEven(num);
	}

	public static void checkEven(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " Even Number ");
		} else {
			System.out.println(num + " Odd Number");
		}
	}

}
