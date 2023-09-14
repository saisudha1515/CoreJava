/*
charAt()   :: StringIndexOutOfBoundsException
charAt()method return type is char.
charAt()method returns the character present at the given index..
If character is available at the given index then we will get the Character. If not we get String Index out of Bound Exception.
For negative index we get StringIndexOutOfBoundsException in charAt()...
*/
package com.qsp.stringprograms;
public class CharAt_Method {
public static void main(String[] args) {
	String str = "Rameswramu";   // In java always index starts with 0
	System.out.println(str.charAt(6));
	System.out.println(str.charAt(11));  //StringIndexOutOfBoundsException because 11 th index is not there in String "Rameswramu"
	System.out.println(str.charAt(-5));  //StringIndexOutOfBoundsException 
}
}
