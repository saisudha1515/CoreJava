// WAP for the below requirement. Create two non static methods and call both methods from the main method and draw the summary diagram?
package AssignmentOnStatic_Local_NonStaticVariables;

public class Program2 {
	public void m1() {
		boolean flag = true;
		String str = "Core Java";
		System.out.println("m1 method executed ");
		System.out.println("Value stored in flag is : " + flag);
		System.out.println("Value stored in str is : " + str);
		System.out.println();
	}

	void m2() { // returnType, method name and parenthesis are the mandatory things for the
				// method and remaining are optional..
		double d = 10.67;
		float f = 66.9f;
		int i = 78;
		long l = 6744l;
		char ch = '&';
		byte b = 6;
		System.out.println("m2 method executed ");
		System.out.println("Value stored is double    : " + d);
		System.out.println("Value stored is float     : " + f);
		System.out.println("Value stored is int       : " + i);
		System.out.println("Value stored is character : " + ch);
		System.out.println("Value stored is byte      : " + b);
		System.out.println("Value stored is long      : " + l);
	}

	public static void main(String[] args) {
		Program2 p = new Program2();
		// new Program2().m1(); // here we are not storing the address of object in a
		// variable
		// new Program2().m2();
		p.m1(); // here we are storing the address of object inside a variable called "p" for
				// reusable purpose..
		p.m2();
	}

}
