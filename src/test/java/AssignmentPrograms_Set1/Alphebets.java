//Write a program to print alphabets based on user choice (user choice so,Scanner class require)?
package AssignmentPrograms_Set1;

import java.util.Scanner;

public class Alphebets {
	public static void displayLowerCase() {
		int count = 0;
		for (int i = 'a'; i <= 'z'; i++) {
			System.out.println((char) i); // convert ASCII values into alphabets.. by doing Explicit conversion..
			count++;
		}
		System.out.println("The count of Alphabets : " + count);
	}

	public static void displayUpperCase() {
		int count = 0;
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.println((char) i);
			count++;
		}
		System.out.println("The count : " + count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// char ch;
		System.out.println("Enter u/U for Upper case and " + "l/L for Lower cae");
		char ch = sc.next().charAt(0); // user is providing input so store in a variable called ch // keep always 0
										// because it is syntax
		if (ch == 'u' || ch == 'U') {
			displayUpperCase();
		} else if (ch == 'l' || ch == 'L') {
			displayLowerCase();
		} else {
			System.out.println("Kindly provide valid choice");
		}
	}

}
