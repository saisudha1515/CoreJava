//Write a program to count both even and odd numbers from m to n ?
package AssignmentPrograms_Set1;

import java.util.Scanner;

public class Both_Even_And_OddNumbers_Count_From_m_To_n {
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
				for (int i = m; i <= n; i++) {
					if (i % 2 == 0) {
						// System.out.println(i);
						evenCount++;
					} else {
						oddCount++;
					}
				}

			} else if (m >= n) {
				for (int i = m; i >= n; i--) {
					if (i % 2 == 0) {
						evenCount++;
					} else {
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
