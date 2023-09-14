// return type of contains()is boolean i.e, true or false..
// This method is used to check whether a particular String is available in the given String or not..if available this method will return true else returns false.. 
package com.qsp.stringprograms;
public class Contains_Method {
	public static void main(String[] args) {
		String str = "Hi this is a String value";
		System.out.println(str.contains("isa")); // false because space is not there in b/w is and a
		System.out.println(str.contains("is a"));
	}
}
