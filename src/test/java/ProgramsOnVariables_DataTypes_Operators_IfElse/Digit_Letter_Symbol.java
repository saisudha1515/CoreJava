package ProgramsOnVariables_DataTypes_Operators_IfElse;

public class Digit_Letter_Symbol {
	public static void main(String[] args) {
		char ch = '3';
		if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " is a lowercase letter");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is a uppercase letter");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + " is a digit");
		} else {
			System.out.println(ch + " is a symbol");
		}
	}
}
