//startsWith()  return type String
// this method will check whether the particular String is started with the given String or not if yes it returns true else it returns false..
// if you want to check character then pass that character also with in double quotes means, pass as a String..
package com.qsp.stringprograms;

public class startsWith_Method {
	public static void main(String[] args) {
		String str = "Hey! am the native of Anantapur, AndhraPradesh";
		System.out.println(str.startsWith("of")); // false
		System.out.println(str.startsWith("Hey")); // true
		System.out.println(str.startsWith("hey")); // false, here data is case sensitive..
		System.out.println(str.startsWith("ey!")); // false
		System.out.println(str.startsWith("H")); // true
		System.out.println(str.startsWith("e")); // false
		System.out.println(str.startsWith("h"));
	}
}
