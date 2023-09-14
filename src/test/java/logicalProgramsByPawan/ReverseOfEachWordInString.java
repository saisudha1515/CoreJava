package logicalProgramsByPawan;

/**
 *  Here we need to extract each and every word from the String and then do reverse of each word and finally add all the words to the String..
 */
import java.util.Scanner;

public class ReverseOfEachWordInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		// Step1: Split the String into words based on space.. for this use split() and it will return String[] array..
		String reverseString = "";
		String[] words = str.split(" ");
		//Step2 : Extract each word from the String and after extracting reverse the String 
		for (String w : words) {
			String reverseWord = "";
			for (int i = w.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + w.charAt(i);
			}
		//Step3 : After each word reversing add the each reversed word to the reversed String
			reverseString = reverseString + reverseWord+" ";
		}

		System.out.println("Reverse of each word in the String : " + reverseString);
	}
}
