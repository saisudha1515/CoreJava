// Write a program to print natural numbers between m and n ? (between means exclude 1st and last values i.e, do +1 for starting index and -1 from ending index in case of forward moving,,, and do -1 form starting index and +1 form ending index in case of back-word direction/moving) 
package AssignmentPrograms_Set1;
import java.util.Scanner;
public class RangeOf_Natural_Numbers_Between_m_And_n {
	static int m, n, num;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of m");
		m = sc.nextInt();
		System.out.println("Enter value of n");
		n = sc.nextInt();
		System.out.println("Natural numbers between " + m + " and " + n + " :");
		rangeOfNaturalNumbers();
	}

	public static void rangeOfNaturalNumbers() {

		if (m != n) {
			int count = 0;
			if (m < n) {
				for (int i = m + 1; i <= n - 1; i++) {
					System.out.println(i);
					count++;
				}
				System.out.println("Natural numbers count in between " + m + " and " + n + " :" + count);
			} else if (m > n) {
				int count1 = 0;
				for (int i = m - 1; i >= n + 1; i--) {
					System.out.println(i);
					count1++;
				}
				System.out.println("Natural numbers count in between " + m + " and " + n + " :" + count1);
			}
		} else {
			System.out.println(
					"Kindly enter valid range, since you might entered same values or may be you entered both values as 0");
		}

	}

}
