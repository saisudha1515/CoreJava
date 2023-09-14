// Write a program to print odd numbers from m to n ?
package AssignmentPrograms_Set1;
import java.util.Scanner;
public class RangeOfOddNumbers_From_m_To_n {
	static int m, n;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of m");
		m = sc.nextInt();
		System.out.println("Enter value of n");
		n = sc.nextInt();
		System.out.println("Odd Numbers form " + m + " to " + n + " :");
		rangeOfOddNumbers();
	}

	public static void rangeOfOddNumbers() {
		if (m != n) {
			int count = 0;
			if (m < n) {
				for (int i = m; i <= n; i++) { // moving from m to n -->forward directio -->i++
					if (i % 2 != 0) {
						System.out.println(i);
						count++;
					}
				}
				System.out.println("Odd numbers count form " + m + " to " + n + " :" + count);

			} else if (m > n) {
				int count1 = 0;
				for (int i = m; i >= n; i--) { // moving from n to m --> backword direction -->i--
					if (i % 2 != 0) {
						System.out.println(i);
						count1++;
					}
				}
				System.out.println("Odd numbers count form " + m + " to " + n + " :" + count1);
			}

		} else {
			System.out.println(
					"kindly provide valid range, since you might have entered same values or both values may be 0");
		}
	}

}
