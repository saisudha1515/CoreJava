// Hierarchial Inheritance means, Multiple classes(more than one class) acquiring properties from a single class is called as "Hierarchial Inheritance "
// Multiple Inheritance is not possible with Classes..we can achieve Multiple Inheritance with the help of "Interface"...
// we should not create object for Parent class because Parent class object does not exist in real world... we can't visualize the Parent class Object..

package inheritance;

class Parent {
	static int num = 30;
	static double dd = 77.6;
	char ch = '*';
	boolean flag = true;
	static String name = "saisudha";
	byte b = 77;
	long lon = 7778l;

	static void m1() {
		Parent pp = new Parent();
		System.out.println("int value :" + num);
		System.out.println("Double value :" + dd);
		System.out.println("character value :" + pp.ch);
		System.out.println("flag value :" + pp.flag);
		System.out.println("string value is :" + name);
		System.out.println("byte value is :" + pp.b);
		System.out.println("long value is :" + pp.lon);
	}

	void uu1() {
		System.out.println("Iam uu1()");
	}

}

class Child1 extends Parent {

}

class Child2 extends Parent {

}

class Child3 extends Parent {

}

class Child4 extends Parent {

}

public class Hierarchial_Inheritance extends Parent {
	public static void main(String[] args) {
		Hierarchial_Inheritance hh = new Hierarchial_Inheritance();
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		Child3 c3 = new Child3();
		Child4 c4 = new Child4();

		System.out.println("Accessing from Main class ");
		System.out.println("-----------------------------");
		m1();
		hh.uu1();
		System.out.println("Accessing from Child1 class ");
		System.out.println("-----------------------------");
		m1();
		c1.uu1();
		System.out.println("Accessing from Child2 class ");
		System.out.println("-----------------------------");
		m1();
		c2.uu1();
		System.out.println("Accessing from Child3 class ");
		System.out.println("-----------------------------");
		m1();
		c3.uu1();
		System.out.println("Accessing from Child4 class ");
		System.out.println("-----------------------------");
		m1();
		c4.uu1();

	}
}
