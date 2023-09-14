// Write a program to print natural numbers from m to n ?
package AssignmentPrograms_Set1;
import java.util.Scanner;
public class RangeOfNaturalNumbers_From_m_to_n {
	public static void main(String[] args) {
		int m, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of m");
		m = sc.nextInt();
		System.out.println("Enter value of n");
		n = sc.nextInt();
		System.out.println("Natural numbers form " + m + " to " + n + " :");
		int count = 0;
		if (m < n) {
			for (int i = m + 1; i <= n; i++) {
				System.out.println(i);
				count++;
			}
			System.out.println("count :" + count);

		} else if (m > n) {
			for (int i = m + 1; i >= n; i--) { // moving from n to m (i.e, back-word direction)so, i--
				System.out.println(i);
				count++;
			}
			System.out.println("count :" + count);

		} else {
			System.out.println("Kindly provide valid range, since the range values are same ");
		}

	}

}
