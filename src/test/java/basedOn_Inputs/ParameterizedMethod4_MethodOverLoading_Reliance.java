//WAP to demonstrate payment in a mall in different ways ?
/*The overload method depends on only two 2 factors
 * 1.Method name, 2.Parameters
 * in which method name must be same and no.of parameters or order of parameters or type of parameters must be different..
 * 
 */

package basedOn_Inputs;

public class ParameterizedMethod4_MethodOverLoading_Reliance {
	public static void makePayment(int noOfNotes) {
		System.out.println("Payment successful using cash ");
	}

	public static void makePayment(float UPI) {
		System.out.println("Payment successful using UPI");
	}

	public static void makePayment(String debt) {
		System.out.println("Payment under Progress ");
	}

	public static void main(String[] args) {
		makePayment(55); // Payment successful using cash
		makePayment(456.56789f); // Payment successful using UPI
		makePayment("Will give you Tomorrow.."); // Payment under Progress
	}

}
