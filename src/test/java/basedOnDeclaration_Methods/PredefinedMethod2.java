// WAP to check whether a character is digit or not 
package basedOnDeclaration_Methods;

public class PredefinedMethod2 {
	public static void main(String[] args) {
		char ch = '8';
		if (Character.isDigit(ch) == true) {
			System.out.println(ch + " is a digit ");
		} else {
			System.out.println(ch + " is not a digit ");
		}
	}
}
