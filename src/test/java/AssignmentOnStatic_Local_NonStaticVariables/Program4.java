//WAP for the below requirement. Create non static variable.Create static method.Print the non static variable in the static method. Call the method from the main method and draw the summary diagram ?
package AssignmentOnStatic_Local_NonStaticVariables;

public class Program4 {
	public boolean flag = true; // non static variable

	public static void m9() {
		double dou = 88.8;
		byte by = 9;
		System.out.println("Value stored in dou is  : " + dou);
		System.out.println("Value stored in by is   : " + by);
		Program4 pp = new Program4();
		// System.out.println("The non static variable stored in the flag is ://
		// "+pp.flag);
		System.out.println("Value stored in dou is  : " + dou);
		System.out.println("The non static variable stored in the flag is : " + new Program4().flag);
		System.out.println("Value stored in by is   : " + by);
	}

	public static void main(String[] args) {
		System.out.println("main method starts execution....... ");
		m9();
		System.out.println("main method ends exection.......... ");
	}

}
