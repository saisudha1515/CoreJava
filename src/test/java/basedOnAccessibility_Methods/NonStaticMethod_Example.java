/* With in the same class 
 * Non static method can be called from static method using Object
 * Non static method can be called from another non static method Directly
 */

package basedOnAccessibility_Methods;
public class NonStaticMethod_Example {
	public void m1() {
		System.out.println("m1 starts ");
		System.out.println("m1 ends ");
	}

	public void m2() {
		System.out.println("m2 starts ");
		System.out.println("m2 ends ");

	}

	public static void main(String[] args) {
		System.out.println("main method starts ");
		System.out.println();
		NonStaticMethod_Example e = new NonStaticMethod_Example();
		e.m1();
		//new NonStaticMethod_Example().m1();
		e.m2();
		//new NonStaticMethod_Example().m2();
		System.out.println(); // gives one new line (i.e, empty line)
		System.out.println("main method ends ");
	}
}
