package Arrays;
public class TypeOfArrayObjects {
	public static void main(String[] args) {
		byte b[] = new byte[5];            //[B
		short s[] = new short[5];          //[S
		int i[] = new int[5];              //[I
		long lo[] = new long[5];           //[J
		float f[] = new float[3];          //[F
		double d[] = new double[5];        //[D 
		char ch[] = new char[4];           //[C
		boolean bo[] = new boolean[3];     //[Z
		String str[] = new String[4];      //[L  //[Ljava.lang.String;
		System.out.println("Byte type of array object      : " + b); 
		System.out.println();
		System.out.println("Byte type of array object      : " + b.getClass().getName());  
		System.out.println("Short type of array Object     : " + s.getClass().getName());  
		System.out.println("Integer type of array Object   : " + i.getClass().getName()); 
		System.out.println("Long type of array Object      : " + lo.getClass().getName());
		System.out.println("Float type of array Object     : " + f.getClass().getName());
		System.out.println("Double type of array Object    : " + d.getClass().getName());
		System.out.println("Character type of array Object : " + ch.getClass().getName());
		System.out.println("Boolean type of array Object   : " + bo.getClass().getName());
		System.out.println("String type of array Object    : " + str.getClass().getName());
	}
}
