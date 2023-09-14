/*Constructor recursion is not possible in java 
 * Calling one constructor by itself is known as Constructor recursion..
 * 
 */
package recursion;

public class Constructer_Recursion {
	public Constructer_Recursion() {
		//this();  // constructor recursion..
		System.out.println("0 Parameters constructor");
	}

	public Constructer_Recursion(int num) {
		System.out.println("1 parameter constructor");
	}

	public static void main(String[] args) {
		Constructer_Recursion cc = new Constructer_Recursion(); // ClassName ObjectReferanceVariable
																// AssignmentOperator(=)new Keyword Constructor
																// followed by ClassName
	}

//===========================================================================	

	// constructor recursion::

//	public static void m2() { // this block will keen on execute and control wil never go to the next line i.e,29th line so Constructor recursion is not possible in java..
//		this(); // at the time of compile the code itself we get error.i,e we get compile time error..
//		System.out.println("m2 executed");
//	}
//	public static void m3() {
//		System.out.println("m3 executed");
//	}
//	public static void main(String[] args) {
//		Constructer_Recursion cc = new Constructer_Recursion();
//		
//	}
// ================================================
	// compiler will provide default constructor only when user don't provide the
	// constructor..and for class constructor is mandatory without constructor there
	// is no class
	// if user provides any user defined constructor then compiler will not provide
	// default constructor..

//	public Constructer_Recursion(int a) {
//		System.out.println("1 parameterised constructor");
//	}
//	public Constructer_Recursion(int a, int b) {
//		this();  // here compiler will not provide default constructor since the user had provided the user defined constructor..
//		System.out.println("2 parameters constructor");
//	}
//	public static void main(String[] args) {
//		Constructer_Recursion cc1 = new Constructer_Recursion(10,20);
//
//	}

	// ====================================================


}
