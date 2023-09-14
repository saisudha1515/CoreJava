//WAP to check whether a character is a Symbol or not  
package basedOnDeclaration_Methods;
public class UserDefinedClassCharacter5 {
	public static void main(String[] args) {
		char ch = '#';
		boolean result = PreDefinedClassCharacter.checkSymbol(ch);
		if (result != true) {
			System.out.println(ch + " is not a Symbol");
		} else {
			System.out.println(ch + " is a Symbol ");
		}
	}
}
