//WAP to check whether a character is White Space or not.. 
package basedOnDeclaration_Methods;
public class UserDefinedMethod6 {

	public static void main(String[] args) {

		char ch = '&';

		/*
		 * NOT RECOMMENDED PROCEDURE
		 */
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is an Upper case letter ");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " is a Lower case letter ");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + " is a Digit ");
		} else if (ch == ' ') {
			System.out.println(ch + " is a White Space ");
		} else if (!(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9' || ch == ' ')) {
			System.out.println(ch + " is a Symbol ");
		} else {
			System.out.println(
					ch + " is not an Upper case letter, lower case letter, digit, white space and not a symbol ");
		}

		// RECOMMENDED PROCEDURE

		if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9' || ch == ' ') {
			System.out.println(ch + " is not a symbol ");
		} else {
			System.out.println(ch + " is a symbol ");
		}
	}
}
