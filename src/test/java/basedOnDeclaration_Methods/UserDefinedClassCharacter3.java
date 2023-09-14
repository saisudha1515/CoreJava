//WAP to check whether a character is a Digit or not  
package basedOnDeclaration_Methods;
public class UserDefinedClassCharacter3 {
	public static void main(String[] args) {
		char ch = '4';
		boolean result = PreDefinedClassCharacter.checkDigit(ch);
		if (result == true) {
			System.out.println(ch + " is a Digit ");
		} else {
			System.out.println(ch + " is not a Digit ");
		}
	}
}
