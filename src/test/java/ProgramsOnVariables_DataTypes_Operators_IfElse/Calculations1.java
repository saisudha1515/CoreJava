package ProgramsOnVariables_DataTypes_Operators_IfElse;

public class Calculations1 {
	public static void main(String[] args) {
		int num1 = 10, num2 = 20, num3 = 30, sum = num1 + num2 + num3, product = num1 * num2 * num3,
				difference = sum - product;
		System.out.println("First Number is                                      :" + num1);
		System.out.println("Second Number is                                     :" + num2);
		System.out.println("Third NUmber is                                      :" + num3);
		System.out.println("Sum of " + num1 + "," + num2 + "&" + num3 + " is      :" + sum);
		System.out.println("Product of " + num1 + "," + num2 + "&" + num3 + " is  :" + product);
		System.out.println("Difference of " + sum + " " + " & " + product + " is :" + difference);
	}
}
