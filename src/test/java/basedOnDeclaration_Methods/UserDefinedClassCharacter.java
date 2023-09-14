//WAP to check whether a character is an Upper case letter or not  
package basedOnDeclaration_Methods;
public class UserDefinedClassCharacter {
	public static void main(String[] args) {
		char ch = 'D';
		boolean result = PreDefinedClassCharacter.checkUpperCase(ch);
		if (result == true) {
			System.out.println(ch + " is an Upper case letter ");
		} else {
			System.out.println(ch + " is not an Upper case letter ");
		}
	}
}
