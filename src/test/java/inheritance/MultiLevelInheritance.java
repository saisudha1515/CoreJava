//Multi level Inheritance means, One class acts as a Sub class and the same class acts as a Parent class is called as Multi level inheritance..
package inheritance;

class AA {
	public static int x = 100;
	public char ch = '6';

	public static void mm1() {
		System.out.println("I am mm1()of Parent class ");
	}

	public static void mm2() {
		System.out.println("I am mm2()if Parent class ");
	}

	public void mm3() {
		System.out.println("I am mm3() of Parent class");
	}
}

class BB extends AA {
	static boolean flag = false;
	double dd = 78; // Implicit conversion will be done by compiler internally.. int will be
					// converted into double by compiler...
	static float ff = 88.87f;

	void ee1() {
		System.out.println("BB class boolean value is : " + flag);
		System.out.println("BB class float value is : " + ff);
		System.out.println("BB class double value is : " + dd);
	}

	public void ss1() {
		System.out.println("I am ss1() present in BB class ");

	}
}

	public class MultiLevelInheritance extends BB {
		public static void main(String[] args) {

			MultiLevelInheritance rr = new MultiLevelInheritance();
			System.out.println("x value is : " + x);
			System.out.println("ch value is : " + rr.ch);
			System.out.println("boolean value is : " + flag);
			System.out.println("float value is : " + ff);
			System.out.println("double value is : " + rr.dd);
			mm1();
			mm2();
			rr.mm3();
			rr.ee1();
			rr.ss1();

		}
	}

