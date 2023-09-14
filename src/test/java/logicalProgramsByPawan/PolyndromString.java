package logicalProgramsByPawan;
/**
 * Polyndrom String is a string which remains same when reverse it's characters of string..
 */
import java.util.Scanner;

public class PolyndromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		String originalString = str;
		//Step1 : Reverse the String   (right to left so backword i--)--> Extract each character from String from the end of the String and store in a variable..
		String revString = "";
		int length = str.length();
		for(int i =length-1;i>=0;i-- ) {
			revString = revString+str.charAt(i);
		}	    
	    //Step2 : Compare the reverse String with original String..
	    System.out.println("OriginalString : "+originalString);
	    System.out.println("ReverseString : "+revString);
	    if(revString.equals(originalString)) {	
	    	System.out.println(originalString+" is a polyndrom String");
	    }
	    else {
	    	System.out.println(originalString+" is not a polyndrom String");
	    }
	}
}
