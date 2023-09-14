// WAP for the below requirement. Create static variable. Create a static method.Print the static variable in the static method and call the method from main method.Draw the summary diagram ?
package AssignmentOnStatic_Local_NonStaticVariables;

public class Program3 {
	public static int num = 10; // static variable

	public static void m5() {
		String str = "Welcome to qspiders!";
		boolean flag = false;
		System.out.println("Value stored in flag is              : " + flag);
		System.out.println("The static variable stored in int is : " + num);
		System.out.println("Value stored str is                  : " + str);
	}

	public static void main(String[] args) {
		System.out.println("main method starts execution ");
		m5();
		System.out.println("main method ends the execution ");
	}
}
