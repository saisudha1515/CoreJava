package ProgramsOnVariables_DataTypes_Operators_IfElse;

public class SwapOfThreeNumbers {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30, d;
		System.out.println("Before Swapping : ");
		System.out.println("Value of a  : " + a);
		System.out.println("Value of b  : " + b);
		System.out.println("Value of c  : " + c);
		System.out.println();

		d = a;
		a = b;
		b = c;
		c = d;

		System.out.println("After Swapping : ");
		System.out.println("Value of a  : " + a);
		System.out.println("Value of b  : " + b);
		System.out.println("Value of c  : " + c);
	}
}
