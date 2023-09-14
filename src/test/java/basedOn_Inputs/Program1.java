//Program to demonstrate compatibility of type of arguments with type of parameter`
package basedOn_Inputs;

public class Program1 {
	public static void display() {
		System.out.println("display method with no parameters ");
	}

	public static void main(String[] args) {
		display(); // JVM search for display method with no arguments..if it is there then it will
					// such method..
	}
}
