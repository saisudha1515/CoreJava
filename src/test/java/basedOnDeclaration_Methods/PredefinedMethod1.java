// WAP to check whether a character is letter or  not 
package basedOnDeclaration_Methods;
public class PredefinedMethod1 {
	public static void main(String[] args) {
		char ch = 'u';
		// boolean result = java.lang.Character.isLetter(ch); // write package name also
		// when compiler is not able to recognise symbol METHOD
		boolean result = Character.isLetter(ch);
		if (result == true) {
			System.out.println(ch + " is a Letter ");
		} else {
			System.out.println(ch + " is not a Letter ");
		}
	}
}
