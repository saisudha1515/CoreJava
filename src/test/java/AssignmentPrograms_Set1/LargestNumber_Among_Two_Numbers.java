//Write a program to print largest of two numbers ?
package AssignmentPrograms_Set1;
import java.util.Scanner;
public class LargestNumber_Among_Two_Numbers {
	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		num1 = sc.nextInt();
		System.out.println("Enter second value");
		num2 = sc.nextInt();
		if (num1 != num2) {
			if (num1 > num2) {
				System.out.println(num1 + " is larger number");
			} else {
				System.out.println(num2 + " is larger number");
			}
		} else {
			System.out.println("Kindly provide different values, both values are same");
		}
	}

}
