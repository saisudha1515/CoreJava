package ProgramsOnVariables_DataTypes_Operators_IfElse;

public class SwapOfTwoNumbers {
	public static void main(String[] args) {
		int a = 10, b = 20, c;
		System.out.println("Before Swapping : ");
		System.out.println("Value of a  : " + a);
		System.out.println("Value of b  : " + b);
		System.out.println();

		c = a;
		a = b;
		b = c;
		System.out.println("After Swapping : ");
		System.out.println("Value of a  : " + a);
		System.out.println("Value of b  : " + b);
	}
}
