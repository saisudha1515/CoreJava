//WAP to store a number and display whether it is Palindrom or not
package InterviewQuestions;

public class Question2 {
	public static void main(String[] args) {
		int num = 12345689;
		int original = num;
		int reverse = 0, digit;
		do {
			digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		} while (num != 0);
		System.out.println("The Actual number is : " + original);
		System.out.println("The reverse number is : " + reverse);

		if (reverse == original) {
			System.out.println(original + " is an Palindrom Number ");
		} else {
			System.out.println(original + " is not a Palindrom Number ");
		}
	}
}
