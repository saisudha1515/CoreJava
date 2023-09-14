// Program to demonstrate method recursion..
/*Method recursion(calling by its self) means calling a method by itself is called as method recursion.
 *If we don't use method recursion wisely we get StackOverFlowError..and StackOverFlowError is a predefined class. 
 *Constructor recursion is not possible in java but method recursion is possible in java..
 *We can use method recursion instead of loop..
 *In order to use method recursion wisely/to overcome the StackOverFlowError, we should provide a condition which means have to tell the JVM how many times the method needs to be executed..
 *
 */
package recursion;

public class Method_Recursion {
	public static void m1() {
		System.out.println("m1()executed..");
		m1();
	}

	public static void main(String[] args) {
		m1();// Static method to static method calling so Directly can call..
	}
}
