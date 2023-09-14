//WAP to check whether a character is a Whitespace or not  
package basedOnDeclaration_Methods;
public class UserDefinedClassCharacter4 {
	public static void main(String[] args) {
		char ch = 'D';
		boolean result = PreDefinedClassCharacter.checkWhiteSpace(ch);
		if (result == true) {
			System.out.println(ch + " is a Whitespace ");
		} else {
			System.out.println(ch + " is not a Whitespace ");
		}
	}
}
