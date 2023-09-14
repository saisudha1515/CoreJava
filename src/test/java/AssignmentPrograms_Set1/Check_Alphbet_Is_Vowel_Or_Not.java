//Write a program to check whether given alphabet is Vowel or not ?        
package AssignmentPrograms_Set1;

import java.util.Scanner;

public class Check_Alphbet_Is_Vowel_Or_Not {
	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter to check vowel or not");
		ch = sc.next().charAt(0);
		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
					|| ch == 'u' || ch == 'U') {
				System.out.println(ch + " is an vowel");
			} else {
				System.out.println(ch + " is not an vowel");
			}
		} else {
			System.out.println("Kindly enter a letter");
		}

	}
}
