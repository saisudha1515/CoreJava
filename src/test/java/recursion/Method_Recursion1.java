// to know how many times the method is gonna executed in case of method recursion(to know the count)declare a counter variable and once message got executed just increase the variable...
package recursion;
public class Method_Recursion1 {
	public static int num = 1; /// global variable that too static variables..

	public static void m1() {
		System.out.println(num);
		num++;
		m1();
	}

	public static void main(String[] args) {
		m1();
	}
}
