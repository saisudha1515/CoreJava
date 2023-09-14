//WAP for the below requirement , Create a Static method. Call the method from  main() method 10 times ?
package basedOnDeclaration_Methods;
public class Market {
	public static void Tomato() // Static Method
	{
		String veg = "Tomato";
		System.out.println("The name of the vegetable is : " + veg);
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("The name of the vegetable is : " + veg);
//		}
	}

	public static void main(String[] args) { // Static Method
		// Tomato(); // Both are static methods so we can call directly by using Method
		// name......

		for (int i = 1; i <= 10; i++) {
			Tomato();
		}
	}
}

/*
 * A method can be called n no.of times in side another method From any where we
 * can call the method but if you want to execute that method you must have to
 * call that method inside main(). Until and unless you call the method it will
 * not be executed...
 */


