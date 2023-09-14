package logicalProgramsByPawan;

/*
 * Here first extract each digit from the number (num%10)
 * and remove the last digit from the number (num/10 which will remove the last digit from the number and give the rest of the number.)
 * After extracting each digit just add the digit to the sum and take one variable as 0
 */
import java.util.Scanner;

public class SumOfDigitsOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("Sum of the digits present in the number is : "+sum);
	}
}
