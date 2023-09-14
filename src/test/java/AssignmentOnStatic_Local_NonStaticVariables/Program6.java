// WAP for the below requirement. Create 2 static variables and 2 non static variables ?
package AssignmentOnStatic_Local_NonStaticVariables;

public class Program6 {
	public static int n = 10;
	public static char ch = 'Y';
	public boolean flag = true;
	public String str = "java";

	public static void main(String[] args) {
		System.out.println(n);
		System.out.println(ch);
		Program6 p = new Program6();
		System.out.println(p.flag);
		System.out.println(p.str);
	}
}
