//WAP to check whether a character is UPPER CASE or not 
package basedOnDeclaration_Methods;
public class PredefinedMethods3 {
	public static void main(String[] args) {
		char ch = 'i';
		boolean result = Character.isUpperCase(ch);
		if (result == true) {
			System.out.println(ch + " is an Upper case ");
		} else {
			System.out.println(ch + " is not a Upper case ");
		}
	}
}
