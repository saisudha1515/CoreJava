//WAP to check whether a character is LOWER CASE or not 
package basedOnDeclaration_Methods;
public class PredefinedMethods4 {
	public static void main(String[] args) {
		char ch = 'i';
		if (Character.isLowerCase(ch) == true) {
			System.out.println(ch + " is a Lower case ");
		} else {
			System.out.println(ch + " is not a Lower case ");
		}
	}
}
