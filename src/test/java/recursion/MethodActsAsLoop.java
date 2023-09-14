/* Program to print a message 5 times by using method recursion..
 * Here method recursion is acting as Loop..since we are given the condition..
 * In order to overcome StackOverFlowError we need to provide a condition (means we need to tell the JVM has to execute the logic/code)
 */

package recursion;

public class MethodActsAsLoop {
	public static int i = 1;
	public static void m1() {
		if(i<=5) {
			System.out.println("Qspiders");
			i++;
			m1();	
		}
	}
	public static void main(String[] args) {
		m1();
	}
}
