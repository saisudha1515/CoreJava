//WAP for the below requirement. Create a static method. call the method from main()10 times..

/* we can call a method n no. of times
 * we can call a method from anywhere in the program
 * To execute a method it must be called from  main()..
 */
package basedOnAccessibility_Methods;

public class StaticMethod_Sample {
//	public static void m1() {
//	System.out.println("M1 Executed ");
//}
//
//public static void main(String[] args) {
//	for (int count = 1; count <= 10; count++) {
//		m1();
//	}
//
//}

// or

public static void m1() {
	for (int count = 1; count <= 10; count++) {
		System.out.println("M1 Executed ");

	}
}

public static void main(String[] args) {
	m1();

}


}
