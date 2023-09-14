//WAP to check whether whitespace is there or not.. 
package basedOnDeclaration_Methods;
public class PredefinedMethods5 {
	public static void main(String[] args) {
		char ch = ' ';
		if (Character.isWhitespace(ch) == true) {
			System.out.println(ch + " is not present, hence white space is there ");
		} else {
			System.out.println(ch + " is present hence, White space is not there ");
		}
	}
}
