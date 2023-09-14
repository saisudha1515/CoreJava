package ProgramsOnVariables_DataTypes_Operators_IfElse;

class CheckOperatorEnrered {
	public static float arithmeticOperators(int num1, int num2, char ch) {
		float result = 0.0f;
		if (ch == '+') {
			result = num1 + num2;
			return result;
		} else if (ch == '-') {
			result = num1 - num2;
			return result;
		} else if (ch == '*') {
			result = num1 * num2;
			return result;
		} else if (ch == '/') {
			result = num1 / num2;
			return result;
		} else if (ch == '%') {
			result = num1 % num2;
			return result;
		} else {
			System.out.println("Kindly enter Arithmetic operator");
//un comment the below commented code for avoid "missing return statement" error..
//result = 0.0f;
//return result;
		}
		return result;
	}
}

public class AOperaion {
	public static void main(String[] args) {
		float res = CheckOperatorEnrered.arithmeticOperators(90, 50, '%');
		System.out.println("The output is : " + res);
	}
}
/*
 * Write a program to store to input two integers and a character.The character
 * will contain any one of the arithmetic operator. Your program should check
 * the operator entered and perform corresonding operations?
 */

///////////////// if we are returning any statements we have to maintain all return statements in all if else ,else block otherwise we get "missing return statement" error....