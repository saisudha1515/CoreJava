// Program to demonstrate predefined method 
package basedOnDeclaration_Methods;
public class PredefinedMethod_a {

	public static void main(String[] args) {
		int num = 100; // here we are hard coding the value to variable num
		//int num1 = Integer.parseInt(args[1]); // allows the user to enter/give input // dynamically we are passing the
												// value
		//int num2 = Integer.parseInt(args[2]);  // accepts 2 values
		//int num3 = Integer.parseInt(args[3]); // accepts 3 values

		double square = Math.sqrt(num); // Math is predefined method and sqrt() returns double
		System.out.println("The square root of " + num + " is : " + square);
		System.out.println("The square root of " + num + " is : " + Math.sqrt(num));
	}
}
