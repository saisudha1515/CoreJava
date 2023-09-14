// equals()is a predined method available in pre defined class i.e, Object class and this Object class is available in predefined package, "java.lang"

/*equals()is already overriden in String class
  equals method return boolean value
  it returns true when the content of two objects is same if the content of 2 objects is not same then equals() returns false..
  equals() is used to compare the content of two different objects..
  equals() is only applicable for non primitive datatypes
  Parent class equals() is used to perform address comparison and overridden equals()(i.e, String class equals()) is used to perform content comparison of the object...
*/

package com.qsp.object;

public class EqualsMethod {
	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = new String("java");
		String str3 = new String("JAVA");
		EqualsMethod ee = new EqualsMethod();
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str1.equals(str3));
		}
}
