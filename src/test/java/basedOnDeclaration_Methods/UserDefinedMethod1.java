//WAP to check whether a character is letter or not.. 
package basedOnDeclaration_Methods;

public class UserDefinedMethod1 {
	public static void main(String[] args) {
		char ch = 'j';

		/*
		 * if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
		 * System.out.println(ch+" is a letter "); } else {
		 * System.out.println(ch+" is not a letter "); }
		 */

		// =================================================
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is an Upper case letter ");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " is a Lower case letter ");
		} else {
			System.out.println(ch + " is not a letter ");
		}
	}

}
