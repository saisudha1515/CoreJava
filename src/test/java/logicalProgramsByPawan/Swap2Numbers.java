package logicalProgramsByPawan;

public class Swap2Numbers {
	public static void main(String[] args) {
		int a, b, temp;
		a = 10;
		b = 20;
		// Logic1 : By using third variable
//		System.out.println("Values stored in a & b before Swapping  : " + a + " " + b);
//		temp = a;
//		a = b;
//		b = temp;
//		System.out.println("Values stored in a & b after Swapping  : " + a + " " + b);
		
		
		
		//Logic2 : Without using third variable/ temporary variable (using + and - operators)
//		a = a+b;
//		b = a-b;
//		a = a-b;
//		System.out.println("Values stored in a & b after Swapping  : " + a + " " + b);
		
		
		
		//Logic3 : Without using third variable/ temporary variable (using * and / operators)
		a = a*b;
		b = a/b;
		a = a/b;
		System.out.println("Values stored in a & b after Swapping  : " + a + " " + b);
		
		
		//Logic 4 :
		b = a+b-(a=b);

		
		
		
		
		
		

	}
}
