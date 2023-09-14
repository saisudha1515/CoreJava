package ProgramsOnVariables_DataTypes_Operators_IfElse;

public class CheckLetter {
	public static void main(String[] args) {
		char ch = '3';
		if (Character.isLetter(ch) == true) {
			System.out.println(ch + " is a letter");
		} else {
			System.out.println(ch + " is not a letter");
		}
	}
}
