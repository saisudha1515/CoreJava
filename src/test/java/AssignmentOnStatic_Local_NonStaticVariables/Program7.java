// WAP for the below requirement.Create one static variable and one non static variable and one local variable. Print all the values in the main method ?
package AssignmentOnStatic_Local_NonStaticVariables;

public class Program7 {
	static float f = 34.567f;
	byte b = 123;

	public static void main(String[] args) {
		String s = "Core Java ";
		System.out.println(f);
		Program7 p = new Program7();
		System.out.println(p.b);
		System.out.println(s);
	}
}
