//Hierarchial_Inheritance
/*
 Write a program for the Hierarchial inheritance. Create one abstract method in the Super class.Complete the method in all 3 Sub classes

 */
package Method_Overriding;

abstract class Parent3 {
	public abstract void mm1();
}

// all 3 Sub classes are sharing the properties from Parent class
class C1 extends Parent3 {
	@Override
	public void mm1() {
		System.out.println("mm1()completed in C1 class");
	}
}

class C2 extends Parent3 {
	@Override
	public void mm1() {
		System.out.println("mm1()completed in C2 class");
	}
}

class C3 extends Parent3 {
	@Override
	public void mm1() {
		System.out.println("mm1()completed in C3 class");
	}
}

public class MainClass2 {
	public static void main(String[] args) {
		C1 c1 = new C1();
		C2 c2 = new C2();
		C3 c3 = new C3();
		c1.mm1();
		c2.mm1();
		c3.mm1();
	}
}
