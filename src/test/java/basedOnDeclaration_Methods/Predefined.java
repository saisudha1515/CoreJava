//WAP to check whether a character is Digit or  not 
package basedOnDeclaration_Methods;
public class Predefined {

	public static void main(String[] args) {
		char ch;
		ch = '*';
		boolean result = Character.isDigit(ch);
		if (result == true) {
			System.out.println(ch + " is a Digit ");
		} else {
			System.out.println(ch + " is  not a Digit ");
		}
	}
}
