package InterviewQuestions;

public class sumEdAndMd {
	public static void main(String[] args) {

		int num = 10;
		int i = 1;
		int square = 1;
		boolean flag = true;
		while (square <= num) {
			square = i * i;
			if (square == num) {
				flag = false;
				// System.out.println(num + " is a perfect square of " + i);
				break;
			}
			i++;
		}
		if (flag == true) {
			System.out.println(num + " is not a perfect square of " + i);
		} else {
			System.out.println(num + " is a perfect square ");
		}
	}
}
