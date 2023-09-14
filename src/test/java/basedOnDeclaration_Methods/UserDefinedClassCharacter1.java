//WAP to check whether a character is an Upper case letter or not  
package basedOnDeclaration_Methods;
public class UserDefinedClassCharacter1 {
	public static void main(String[] args) {
		char ch = 'D';
		boolean result = PreDefinedClassCharacter.checkLowerCase(ch);
		if (result == true) {
			System.out.println(ch + " is an Lower case latter ");
		} else {
			System.out.println(ch + " is not an Lower case letter ");
		}
	}
}
