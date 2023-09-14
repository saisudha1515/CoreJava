// Write program to swap 2 numbers
package assignment_Exam_Programs;
import java.util.Scanner;
public class Swap2Numbers {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		a = sc.nextInt();
		System.out.println("Enter value of b : ");
		b = sc.nextInt();
		System.out.println("Values before swapping\n-------------------------");
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : " + b);
		System.out.println();
		System.out.println("Values after swapping\n----------------------------");
		c = a;
		a = b;
		b = c;
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : " + b);
	}
}
