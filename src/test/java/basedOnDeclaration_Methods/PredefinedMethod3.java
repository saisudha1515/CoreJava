//WAP to check whether a character is letter or  not 
package basedOnDeclaration_Methods;

public class PredefinedMethod3 {
	public static void main(String[] args) {
		char ch;
		ch = 't';
		boolean result = Character.isDigit(ch);
		// boolean result = java.lang.Character.isDigit(ch);
		if (result == true) {
			System.out.println(ch + " is a Digit ");
		} else {
			System.out.println(ch + " is  not a Digit ");
		}
	}
}
