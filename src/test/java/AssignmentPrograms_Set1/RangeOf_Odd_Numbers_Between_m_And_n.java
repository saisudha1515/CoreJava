//Write a program to print odd numbers between m and n ?  (between means exclude 1st and last values i.e, do +1 for starting index and -1 from ending index in case of forward moving,,, and do -1 form starting index and +1 form ending index in case of back-word direction/moving)
package AssignmentPrograms_Set1;
import java.util.Scanner;
public class RangeOf_Odd_Numbers_Between_m_And_n {
	static int m, n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of m");
		m = sc.nextInt();
		System.out.println("Enter value of n");
		n = sc.nextInt();
		System.out.println("Odd Numbers between " + m + " and " + n + " :");
		rangeOfOddNumbers();
	}

	public static void rangeOfOddNumbers() {
		if (m != n) {
			int count = 0;
			if (m < n) {
				for (int i = m+1; i <= n-1; i++) { // moving from m to n -->forward directio -->i++
					if (i % 2 != 0) {
						System.out.println(i);
						count++;
					}
				}
				System.out.println("Odd numbers count in between " + m + " and " + n + " :" + count);

			} else if (m > n) {
				int count1 = 0;
				for (int i = m-1; i >= n+1; i--) { // moving from n to m --> backword direction -->i--
					if (i % 2 != 0) {
						System.out.println(i);
						count1++;
					}
				}
				System.out.println("Odd numbers count in between " + m + " and " + n + " :" + count1);
			}

		} else {
			System.out.println(
					"kindly provide valid range, since you might have entered same values or both values may be 0");
		}
	}
}
