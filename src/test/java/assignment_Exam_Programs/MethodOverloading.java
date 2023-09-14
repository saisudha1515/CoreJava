// Write a program to demonstrate Method overloading
/* for method overriding we require 
   1. Inheritance (i.e, more than 1 class )
   2. @Override annotation
   3. we can override only "NON STATIC" methods.. static methods we can't override..
*/
package assignment_Exam_Programs;
public class MethodOverloading {
	public  void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("The sum of " + num1 + " and " + num2 + " :" + sum);
	}

	public static void add(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		System.out.println("The sum of " + num1 + ", " + num2 + " and " + num3 + " : " + sum);
	}

	public static void add(int num, String name) {
		String concate = num + name;
		System.out.println("The concatenation of " + num + " and " + name + " : " + concate);
	}
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.add(10, 20);
		add(100, "ram");
		add(100, 200, 300);
	}

}
