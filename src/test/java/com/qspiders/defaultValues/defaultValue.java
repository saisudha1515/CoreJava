package com.qspiders.defaultValues;

public class defaultValue {
	byte b;                      // non static variable
	public short s;              // non static variable
	public static int num;       // static variable
	long l;                      //non static variable
	static float f;              // static variable
	double dou;                  // non static variable
	static char ch;              // static variable
	static boolean flag;         // static variable
	String str;                  // non static variable

	public static void main(String[] args) {
		defaultValue c = new defaultValue();
		
		System.out.println("byte default value is  : "+c.b);  //0
		System.out.println("short default value is : "+c.s); //0
		System.out.println("int default value is   : "+num); //0
		System.out.println("long default value is   : "+c.l); //0
		System.out.println();
		System.out.println("float default value is : "+f); //0.0
		System.out.println("double default value is:"+c.dou); //0.0
		System.out.println();
		System.out.println("character default value is : "+ch);  // single empty space
		System.out.println();
		System.out.println("boolean default value is : "+flag);  //false
		System.out.println();
		System.out.println("String default value is : "+c.str);  //null
	}
}
