/*length() return type is int. and length() method is used to count the number of characters available in the given String..
  Here space is also considered as one character.. and also single quotes are also considered as character.
  In Arrays we use length variable to find the size/no of elements present in the array..
  In String we use length() method is used to find the count of characters present in the String..
 */
package com.qsp.stringprograms;
public class Lenth_Method {
	public static void main(String[] args) {
		String str = "Ananthapuramu is one of the distict in the Andhrapradesh";
		String str1 = "'Ananthapuramu is one of the distict in the Andhrapradesh'";
		System.out.println("No.of characters present in "+str+" is  : "+str.length());
		System.out.println("No.of characters present in "+str1+" is :  "+str1.length());
		
//		
//		 int count = str.length();
//		 System.out.println("No.of characters available in "+str+" is : "+count);
	}
}
