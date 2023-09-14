//WAP to check whether a character is SYMBOL or not.. 
package basedOnDeclaration_Methods;
public class UserDefinedMethod3 {
	public static void main(String[] args) {
		char ch = '*';
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is an Upper case letter ");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " is a Lower case letter ");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + " is a Digit ");
		} else {
			System.out.println(ch + " is a Symbol ");
		}
	}
}
