package inheritance;
class Demo {
	public static int x = 20;
	boolean flag = true;

	void m1() {
		System.out.println("m1() method is executed..");
	}

	public static void m2() {
		System.out.println("m2() method is executed..");
	}

	public static void m3() {
		System.out.println("m3() method is executed..");
	}
}

public class Single_Level_Inheritance extends Demo{  // now Single_Level_Inheritance class got all Sample class properties so we can access them through Single_Level_Inheritance class..

	public static void main(String[] args) {     // By creating object for Child class only we are accessing both Child class as well as Parent class all methods so here we are not creating parent class object so this is code re-usability
		Single_Level_Inheritance ss = new Single_Level_Inheritance();
		System.out.println("main()method execution starts..");
		System.out.println("Value stored in x is : " + x);
		System.out.println("Value stored in flag is : " + ss.flag);
		ss.m1();
		m2();
		m3();
		System.out.println("main()method execution ends..");

	}
}
