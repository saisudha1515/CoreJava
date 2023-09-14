// WAP for the below requirement. Create a static method then call the static  method in the same class from main() ?
package basedOnAccessibility_Methods;
public class StaticMethod1_WorkMen {
	public static void work() {
		System.out.println("Work done by workmen ");
	}

	public static void main(String[] args) {
		System.out.println("Main method Starts ");
		work();
		System.out.println("Main method ends ");
	}
}
