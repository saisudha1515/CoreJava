//endsWith()  return type is String
// this method will check whether the particular String is ended with the given String or not if yes it returns true else it returns false..
// if you want to check character then pass that character also with in double quotes means, pass as a String..

package com.qsp.stringprograms;

public class endsWith_Method {
	public static void main(String[] args) {
		String str = "Amarnath has done his graduation in  the college called JNTU ";
		System.out.println(str.endsWith("has")); // false
		System.out.println(str.endsWith("JNTU "));// true
		System.out.println(str.endsWith("JNTU"));// false because data is case sensitive..  space is not there 
		System.out.println(str.endsWith("amar"));//false because data is case sensitive..
		System.out.println(str.endsWith("u")); //false
		System.out.println(str.endsWith("U")); // false
		System.out.println(str.endsWith("u")); //false
		System.out.println(str.endsWith(" ")); // true   single space
		System.out.println(str.endsWith(""));// true     no space
		System.out.println(str.endsWith("  ")); // false  2 spaces
	}
}
