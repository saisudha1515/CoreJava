//WAP to store a number and display whether it is Perfect Number or not
package InterviewQuestions;

public class Question3 {
	public static void main(String[] args) {
		int num = 8128, sum = 0;
		System.out.println(num + " factors are : ");
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
				sum = sum + i;
			}
		}
		System.out.println();
		System.out.println("Sum of factors   : " + sum);
		System.out.println("Number is        : " + num);
		if (sum == num) {
			System.out.println(num + " is a Perfect Number ");
		} else {
			System.out.println(num + " is not a Perfect Number  ");
		}
	}
}
