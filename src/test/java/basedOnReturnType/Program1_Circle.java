// WAP for the below requirement. Diameter of a circle is 30cm. Find the circumference ?
package basedOnReturnType;
public class Program1_Circle {
	public static double findRadius(double d) {
		return d / 2.0;
	}

	public static void findCircumference(double radius) {
		double c = 2 * 2.147;
		System.out.println("Circumference is : " + c);
	}

	public static void main(String[] args) {
		double diameter = 30;
		double r = findRadius(diameter);// contains output of method
		findCircumference(r);// output of one method is input for another method
	}
}
