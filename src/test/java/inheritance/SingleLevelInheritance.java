/*
 Single Level Inheritance means, The process of acquiring properties from only one another class is called as Single level Inheritance.. 
*/
package inheritance;

class A1 {
	public static int x = 10; // SV
	public double d = 90.4; // NSV

	public static void m1() { // Static method
		System.out.println("m1() present in Parent class ");
	}

	public void m2() { // non static method
		boolean flag = true;
		System.out.println("m2() present in Parent class ");
		System.out.println("m2() boolean value stored is : " + flag);
	}

	public static void m3() { // static method
		char ch = 'y';
		System.out.println("m3() character value stored is : " + ch);
		System.out.println("m3() present in Parent class ");
	}

}

public class SingleLevelInheritance extends A1 {
	public static void main(String[] args) { // static method
		SingleLevelInheritance ss = new SingleLevelInheritance();
		System.out.println("value stored in x is : " + x);
		System.out.println("value stored in d is : " + ss.d);
		m1();
		ss.m2();
		m3();
		System.out.println("main method ends..");

	}
}
