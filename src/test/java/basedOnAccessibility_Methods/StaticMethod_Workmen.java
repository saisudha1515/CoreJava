/*WAP for the below requirement. Create a static method then call the static method in the same class from main()*/
package basedOnAccessibility_Methods;
public class StaticMethod_Workmen {
	public static void work() {
		System.out.println("Work done by Workmen ");
	}

	public static void main(String[] args) {
		System.out.println("Main method Starts");
		work(); // method calling
		System.out.println("Main method ends ");
	}
}
