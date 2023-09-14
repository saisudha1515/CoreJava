package logicalProgramsByPawan;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Stirng : ");
		String str = sc.nextLine();
		// Logic1 : By using StringBuffer Class
//		StringBuffer sb = new StringBuffer(str);
//		StringBuffer reverseStr = sb.reverse();
//		System.out.println("Reverse String for :" + str + " is : " + reverseStr);
		
		
		
		
		// Logic2 : By Using String Concatenation operator(+)
		/**
		 * Here we need to find the length
		 * use charAt() method and  length()
		 */
		int len = str.length();
		String revStr = ""; //empty ""
		for(int i = len-1;i>=0;i--) {
			revStr = revStr+str.charAt(i);	
		}
		System.out.println("Reverse String is :"+revStr);
	}
}
