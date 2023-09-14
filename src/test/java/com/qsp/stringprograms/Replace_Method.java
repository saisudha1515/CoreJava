/*  replace()method return type is String
 *  replace() method is used to replace a particular String(old string) with the given String(new string)..
 *  replace()method is overloaded method in String class..
 *  here old string "am" is getting replaced with new string "was"
 *  we can replace single character or sequence of characters or group of characters i.e, String..
 */
package com.qsp.stringprograms;

public class Replace_Method {
	public static void main(String[] args) {
		String str = "I am good and am living in Ananthapur";
		System.out.println(str.replace("am", "was"));
		System.out.println(str.replace('I', 'z')); // here data is case Sensitive i and I both are not same..
	}
}
