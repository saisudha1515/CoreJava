/*
wrapper classes are the predefined classes which are available in predefined package i.e, java.lang package.
toString()method is already overriden in all Wrapper classes so we get content of the object in wrapper classes when we print referance variable..
Wrapper classes are used to convert primitive type value into wrapper class onject and vice a versa.
wrapper classes are used to perform boxing and un-boxing..
Boxing means, the process of converting primitive type value into wrapper class object by using one static method called valueOf().. 
*/

package com.qsp.wrapperClasses;

public class Boxing {
	public static void main(String[] args) {
		byte num = 100;
		Byte byteObject = Byte.valueOf(num);
		System.out.println("Byte Object      : " + byteObject);
		System.out.println();
		short num1 = 200;
		Short shortObject = Short.valueOf(num1);
		System.out.println("Short object     : " + shortObject);
		System.out.println();
		int num3 = 300;
		Integer integerObject = Integer.valueOf(num3);
		System.out.println("Integer Object   : " + integerObject);
		System.out.println();
		long num4 = 4074638l;
		Long longObject = Long.valueOf(num4);
		System.out.println("Long Object      : " + longObject);
		// System.out.println(Long.valueOf(num4));
		System.out.println();
		float num5 = 500f;
		Float floatObject = Float.valueOf(num5);
		System.out.println("Float Object     : " + floatObject);
		double num6 = 89977787;
		Double doubleObject = Double.valueOf(num6);
		System.out.println("Double Object    : " + doubleObject);
		// System.out.println(Double.valueOf(num6));
		System.out.println();
		char ch = 'g';
		Character characterObject = Character.valueOf(ch);
		System.out.println("Character Object : " + characterObject);
		System.out.println();
		boolean flag = true;
		Boolean booleanObject = Boolean.valueOf(flag);
		System.out.println("Boolean Object   : " + booleanObject);

		// Auto Boxing::
		Byte byteObject1 = (byte) 6557; // here the byte range exceeds so we have to do explicit conversion, means
										// forcefully we have to convert the interger in to byte..
		System.out.println("byte object value : " + byteObject1);
		System.out.println();
		Short shortObject1 = (short) 7573426; // here we are forcefully converting the integer into short..
		System.out.println("Short object value : " + shortObject1);
		System.out.println();
		Integer intObject = 100;
		System.out.println("integer objetc value : " + intObject);
		System.out.println();
		Long longObject1 = 6326275372l;
		System.out.println("long object value : " + longObject1);
		System.out.println();
		Float floatObject1 = 653263f;
		System.out.println("Float object value : " + floatObject1);
		System.out.println();
		Double doubleObject1 = 63626.66;
		System.out.println("Double object value : " + doubleObject1);
		System.out.println();
		Boolean booleanObject1 = true;
		System.out.println("Boolean object value : " + booleanObject1);
		System.out.println();
		Character characterObject1 = 'g';
		System.out.println("Character object value : " + characterObject1);
		System.out.println();
	}
}
