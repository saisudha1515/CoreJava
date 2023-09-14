// Write a program to print even numbers from m to n ?(between means exclude 1st and last values)
package AssignmentPrograms_Set1;
import java.util.Scanner;
public class RangeOfEvenNumbers_From_m_To_n {
	static int m, n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of m");
		m = sc.nextInt();
		System.out.println("Enter value of n");
		n = sc.nextInt();
		System.out.println("Even Numbers form " + m + " to " + n + " :");
		rangeOfEvenNumbers();
	}

	public static void rangeOfEvenNumbers() {
		if (m != n) {
			if (m < n) {
				int count = 0;
				for (int i = m; i <= n; i++) {
					if (i % 2 == 0) {
						System.out.println(i);
						count++;
					}
				}
				System.out.println("Even numbers count from " + m + " to " + n + " :" + count);

			} else if (m > n) {
				int count1 = 0;
				for (int i = m; i >= n; i--) {
					if (i % 2 == 0) {
						System.out.println(i);
						count1++;
					}
				}
				System.out.println("Even numbers count form " + m + " to " + n + " :" + count1);
			}

		} else {
			System.out.println(
					"Kindly provide valid range, since you might have entered same values or you may be entered both the values as 0");
		}
	}


}
