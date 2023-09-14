// Write a program to count both even and odd numbers from m to n  and also print the even and odd numbers ?
package AssignmentPrograms_Set1;

import java.util.Scanner;

public class Practice_Program {
	static int evenCount = 0, oddCount = 0;

	public static void main(String[] args) {
		int m, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of m");
		m = sc.nextInt();
		System.out.println("Enter value of n");
		n = sc.nextInt();
		display(m, n);
	}

	public static void display(int m, int n) {
		if (m != n) {
			if (m < n) {
				System.out.println("Even numbers \n-------------");
				for (int i = m; i <= n; i++) {
					if (i % 2 == 0) {
						System.out.println(i);
						evenCount++;
					}
				}
				System.out.println();
				System.out.println("Odd Numbers \n--------------");
				for (int i = m; i <= n; i++) {
					if (i % 2 != 0) {
						System.out.println(i);
						oddCount++;
					}
				}
			} else if (m >= n) {
				System.out.println("Even Numbers \n-------------");
				for (int i = m; i >= n; i--) {
					if (i % 2 == 0) {
						System.out.println(i);
						evenCount++;
					}
				}
				System.out.println();
				System.out.println("Odd Numbers \n--------------");
				for (int i = m; i >= n; i--) {
					if (i % 2 != 0) {
						System.out.println(i);
						oddCount++;
					}
				}
			}

		} else {
			System.out.println(
					"Kindly enter valid range , since you might have entered same values or you may be entered both values as 0");
		}
		System.out.println("Even numbers count form " + m + " to " + n + " :" + evenCount);
		System.out.println("Odd numbers count form " + m + " to " + n + "  :" + oddCount);

	}

}
