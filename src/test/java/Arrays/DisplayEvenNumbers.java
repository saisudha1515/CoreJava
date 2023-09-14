// Write a program to store 5 numbers and display even numbers among those 10 numbers..
package Arrays;
import java.util.Scanner;
public class DisplayEvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nm[] = new int[5]; // integer array has been created with 10 cells.. with array name nm
		System.out.println("Enter values/numbers into array");
		for (int i = 0; i < nm.length; i++) {
			nm[i] = sc.nextInt();
		}
		System.out.println("Values stored in the array : ");
		for (int i = 0; i < nm.length; i++) {
			System.out.println(nm[i]);
		}
		System.out.println("Even values stored into the array : ");
		for (int i = 0; i < nm.length; i++) { // it is a block in a program we can have n no.of blocks.. or for()loops..
			if (nm[i] % 2 == 0&&nm[i]!=0) {  // put this condition (&&nm[i]!=0) if you do not want to consider 0 as even number..
				System.out.println(nm[i]);
			}
		}
		System.out.println("Odd numbers present in the array : ");
		for (int j = 0; j < nm.length; j++) {
			if (nm[j] % 2 != 0) {
				System.out.println(nm[j]);
			}
		}

	}

}
