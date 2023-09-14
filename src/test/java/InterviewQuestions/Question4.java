//WAP to check whether the given number is perfect number or not 

package InterviewQuestions;

public class Question4 {
	public static void main(String[] args) {
		int a = 6, i = 1, factors = 0;
		while (i <= a / 2) {
			if (a % i == 0) {
				factors = factors + i;
			}
			i++;
		}
		if (factors == a) {
			System.out.println(a + " is a perfect number ");
		} else {
			System.out.println(a + " is not a perfect number ");
		}
	}
}
