package logicalProgramsByPawan;
/**
 * FibonacciSeries means a series of numbers in which each number is the sum of the two preceding numbers..
 */
public class FibonacciSeries {
public static void main(String[] args) {
	int n1=0, n2=1, sum =0;
	System.out.println(n1+"  "+n2);
	for(int i = 2; i<=50;i++) {  // here we already added/ used  0 and 1 so start with 2 and how many FibonacciSeries you want declare that many number of count.here i want 50 FibonacciSeries numbers..
		sum = n1+n2; // the sum of two preceding numbers is the result of next number.
		System.out.println(" "+sum);
		//System.out.print(" "+sum);
		//interchange these two values
		n1 = n2;
		n2 = sum;
		
	}
}
}
