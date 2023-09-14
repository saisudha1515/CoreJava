/* The process of calling one constructor in side another constructor by using this(),super()statements[if with in the class use this()]is called Constructor chaining..
 * The main use of Constructor chaining is code re-usability or code optimization(i.e reduce the no.of code lines)
 *  by creating one object only we are calling all constructors that are present in the class .
 *  we can call only one constructor inside another constructor we can't call more than one constructor inside another constructor.
 *  if we have n no.of constructors the this()call statements should be n-1suppose if we have n no.of this() call statements we bound to get constructor recursion.
 *  this()call statement should be the first statement in the constructor and we should not have 2 this()call statements in one constructor
 *  create object for the constructor which is having max/more formal arguments or parameters 
 *  parameters are nothing but variable declaration..
 *  when we call one constructor in side another constructor the controller pause the current constructor and execute the calling constructor logic...
 * In constructor, two constructor are calling each other is not possible because we get recurssive constructor invocation(means calling) compile time error 
 */
package constructerChaining;

public class Program1_this_call_statement {
	// Global variables (non static variables) declaration and initialization
//		int a;
//		int b;
//		int c;
		int a, b, c;

		public Program1_this_call_statement() {
			// if we call this() statement then 2 constructor will keep on calling each other sothat we get recurssive constructor invocation(means calling) compile time error 
			System.out.println("0 parameter/0 formal argument constructer ");
		}

		public Program1_this_call_statement(int a) {
			this();
			this.a = a;
			System.out.println("1 parameter constructer ");
		}

		public Program1_this_call_statement(int a, int b) {
			this(a);
//			this.a = a; here no need again initialize the non static variable as we already initialized the variable a value as 10
			this.b = b;
			System.out.println("2 parameters constructer ");
		}

		public Program1_this_call_statement(int a, int b, int c) {
			this(a, b);
//			this.a = a; // again we no need to initialized the variable a,b values as we already initialized a,b values simply call those by using this() statement..
//			this.b = b; // again we no need to initialized the variable a,b values as we already initialized a,b values simply call those by using this() statement..
			this.c = c;
			System.out.println("3 parameters constructer ");
		}

		public static void main(String[] args) {
			Program1_this_call_statement p = new Program1_this_call_statement(10, 20, 30); // actual values should be pass at the time object creation..
			System.out.println(p.a + " " + p.b + " " + p.c); //code optimization...

		}
}
