//WAP to check whether a character is a letter or not  
package basedOnDeclaration_Methods;
public class UserDefinedClassCharacter2 {
	public static void main(String[] args) {
		char ch = 'D';
		boolean result = PreDefinedClassCharacter.checkLetter(ch);
		if (result == true) {
			System.out.println(ch + " is a letter ");
		} else {
			System.out.println(ch + " is not a letter ");
		}
	}
}
