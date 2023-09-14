//Write a program to count numbers between m and n which are divisible by 3 and 7 ?
package AssignmentPrograms_Set1;
import java.util.Scanner;
public class Count_Of_Numbers_Divisible_By_3_And_7_From_m_To_n {
	static int m, n, threeDivCount = 0, sevenDivCount = 0, nonDivCount = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of m");
		m = sc.nextInt();
		System.out.println("Enter value of n");
		n = sc.nextInt();
		divisibleBy3And7(m, n);
	}

	public static void divisibleBy3And7(int m, int n) {
		int count = 0, notDivCount = 0;
		System.out.println("Divisible by both 3 and 7 numbers : \n---------------------------------------");
		for (int i = m; i <= n; i++) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.println(i);
				count++;
			} else {
				// System.out.println(notDivCount);
				notDivCount++;
			}
		}

		System.out.println("Divisible by both 3 & 7 Count : " + count);
		System.out.println("Not divisible by 3 & 7 Count : " + notDivCount);

	}
}
