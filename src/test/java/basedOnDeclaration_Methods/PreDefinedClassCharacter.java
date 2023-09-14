/*WAP to create predefined class for Chaarcters class and write all predefined methods inside that class and use those predefined methods in another class i.e another user defined class 
 A Class ca have n no.of classes based on programmer requirement.. but only one MAIN method should have..
*/

package basedOnDeclaration_Methods;
public class PreDefinedClassCharacter {
	public static boolean checkUpperCase(char ch) {
		if (ch >= 'A' && ch <= 'Z') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkLowerCase(char ch) {
		if (ch >= 'a' && ch <= 'z') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkLetter(char ch) {
		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkDigit(char ch) {
		if (ch >= '0' && ch <= '9') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkWhiteSpace(char ch) {
		if (ch == ' ') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkLetterOrDigit(char ch) {
		if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
			return true;
		} else {
			return false;
		}
	}

//	public static boolean checkSymbol(char ch) {
//		if (!(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9' || ch == ' ')) {
//			return true;
//		} else {
//			return false;
//		}
//	}

	// Method Calling (calling one method inside another Method is called Method Calling/Method Chaining)
	public static boolean checkSymbol(char ch) //// Method calling
	{
		if (ch != ' ') {
			boolean result = checkLetterOrDigit(ch);
			if (result == false) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

}
