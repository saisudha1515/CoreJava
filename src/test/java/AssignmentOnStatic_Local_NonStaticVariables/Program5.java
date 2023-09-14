package AssignmentOnStatic_Local_NonStaticVariables;
public class Program5 {
	public static int x = 20; // static variable
	public double y = 78.9; // non static variable

	public static void m1() {
		System.out.println("m1 executed ");
	}

	public void m2() {
		System.out.println("m2 executed ");
	}

	public static void main(String[] args) {
		Program5 p = new Program5();
		System.out.println("Static variable value : " + x);
		System.out.println("Non static variable value : " + p.y);
		m1();
		p.m2();
	}

}
