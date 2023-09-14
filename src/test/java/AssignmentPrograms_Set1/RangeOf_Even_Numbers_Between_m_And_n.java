//Write a program to print even numbers between m and n ?  (between means exclude 1st and last values i.e, do +1 for starting index and -1 from ending index in case of forward moving,,, and do -1 form starting index and +1 form ending index in case of back-word direction/moving)
package AssignmentPrograms_Set1;
import java.util.Scanner;
public class RangeOf_Even_Numbers_Between_m_And_n {
	static int m, n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of m");
		m = sc.nextInt();
		System.out.println("Enter value of n");
		n = sc.nextInt();
		System.out.println("Even Numbers between " + m + " and " + n + " :");
		rangeOfEvenNumbers();
	}

	public static void rangeOfEvenNumbers() {
		if (m != n) {
			if (m < n) {
				int count = 0;
				for (int i = m+1; i <= n-1; i++) {
					if (i % 2 == 0) {
						System.out.println(i);
						count++;
					}
				}
				System.out.println("Even numbers count in between " + m + " and " + n + " :" + count);

			} else if (m > n) {
				int count1 = 0;
				for (int i = m-1; i >= n+1; i--) {
					if (i % 2 == 0) {
						System.out.println(i);
						count1++;
					}
				}
				System.out.println("Even numbers count in between " + m + " and " + n + " :" + count1);
			}

		} else {
			System.out.println(
					"Kindly provide valid range, since you might have entered same values or you may be entered both the values as 0");
		}
	}
}
