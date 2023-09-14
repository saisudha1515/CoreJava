// Write a program to check whether the given number is Prime number or not 
package assignment_Exam_Programs;
import java.util.Scanner;
public class PrimeNumber {

	/*
	 * first know the count of factors if count is 2 then the num is prime else not
	 * prime number
	 *
	 */

	public static void main(String[] args) {
		int num, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is Prime or not");
		num = sc.nextInt();
		System.out.println(num + " Factors are : \n--------------------------------");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println();
		System.out.println(num + " Factors count : " + count);
		if (count == 2) {
			System.out.println(num + " is a Prime");
		} else {
			System.out.println(num + " is not a Prime");
		}

	}
}
