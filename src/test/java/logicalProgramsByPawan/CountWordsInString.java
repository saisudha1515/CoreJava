package logicalProgramsByPawan;
/**
 * charAt()method is used to extract the particular character based on the index position i.e, "i".
 * charAt()and arrays will start the index from 0 but length() will start the index from 1 so we need to do -1 from length since the charAt()index starts from 0.
 * Extract each and every character from the String and where the character is space that is the end of the word and after the space there should be present character in the scence there is no empty after space or it should not have the space.
 * i.e, str.chatAt(i)==" "(i.e, character should be space) && str.charAt(i)!=" "(i.e, there should not be space.character should be present)
 * '' --> it is empty character and ' '--> it is Space. space will also be considered as one character.
 */
		
import java.util.Scanner;

public class CountWordsInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		int lengthOfStr = str.length();
		int count = 1;
		for(int i = 0; i<str.length()-1;i++) { // how many no.of characters are there that many no.of times repeat the loop..
			if(str.charAt(i)==' ' && str.charAt(i+1)!= ' ') {  // character should be space and should followed by character.. should not have two spaces..
				count++;
			}
		}
        System.out.println("Number of words in a String : "+str+"is : "+count);
	}
}
