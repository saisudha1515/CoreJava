/*
Un-boxing means, the process of converting wrapper class object into primitive type value
We can perform unboxing by using one non static method called (dataTypevalue()..),xxxxxvalue()
*/

package com.qsp.wrapperClasses;

public class UnBoxing {
	public static void main(String[] args) {
		Byte byteObject = 10;
		byte num = byteObject.byteValue();
		System.out.println("Value of byte  : " + num);
		System.out.println();
		Short shortObject = 300;
		short num1 = shortObject.shortValue();
		System.out.println("Value of short : " + num1);
		System.out.println();
		Integer integerObject = 100;
		int num2 = integerObject.intValue();
		System.out.println("Value of int   : " + num2);
		System.out.println();
		Long longObject = 400l;
		long num4 = longObject.longValue();
		System.out.println("Value of long  : " + num4);
		System.out.println();
		Float floatObject = 767.4f;
		float num5 = floatObject.floatValue();
		System.out.println("Value of float : " + num5);
		System.out.println();
		Double doubleObject = 536.556;
		double num6 = doubleObject.doubleValue();
		System.out.println("Value of double : " + num6);
		System.out.println();
		Character characterObject = 'u';
		char ch = characterObject.charValue();
		System.out.println("Value of character : " + ch);
		System.out.println();
		Boolean booleanObject = false;
		boolean flag = booleanObject.booleanValue();
		System.out.println("Value of boolean  : " + flag);
		System.out.println();

		// Auto Un-boxing ::
		byte b = 64;
		System.out.println("value of byte  : " + b);
		short sh = 632;
		System.out.println("value of shotr : " + sh);
		int x = 10;
		System.out.println("value of int   : " + x);
		long l = 56215656l;
		System.out.println("value of long  : " + l);
		System.out.println();
		float f = 6756f;
		System.out.println("float value    : " + f);
		double d = 54623.6356;
		System.out.println("double value   : " + d);
		System.out.println();
		boolean flag1 = false;
		System.out.println("boolean value  : " + flag1);
		char ch1 = 'd';
		System.out.println("value of character : " + ch1);
	}
}
