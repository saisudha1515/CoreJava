// WAP for the below requirement. Create two static methods and call both methods from the main method and draw the summary diagram?
package AssignmentOnStatic_Local_NonStaticVariables;

public class Program1 {
	public static void sum() {
		int a = 10, b = 45;
		int result = a + b;
		System.out.println("The Sum of " + a + " and " + b + " is                 : " + result);
	}

	public static void multiplication() {
		double num1 = 78.8;
		float num2 = 56.2f;
		double res = num1 * num2;
		System.out.println("The Multiplication of " + num1 + " and " + num2 + " is : " + res);
		System.out.println("The Multiplication of " + num1 + " and " + num2 + " is : " + Math.ceil(res));
	}

	public static void main(String[] args) {
		sum();
		multiplication();

	}

}
