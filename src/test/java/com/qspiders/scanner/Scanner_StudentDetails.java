/*
 
Write a program to store the below details of a student entered by the user.The details inclides
name,
age,
blood group,
mobile number,
course
Display the details after the details are stored...

if i use next() for string it will not receive spaces(space tarwatha unna dhi print avvadhu), but if i use nextLine() it will receive spaces also

*/
package com.qspiders.scanner;
import java.util.Scanner;
public class Scanner_StudentDetails {
	public static void main(String[] args) {
//		System.out.println("Please enter your name ");
//		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
//		System.out.println("Hi " + name + "! Hope you are doing great!");
//		System.out.println("Enter your Blood Group");
//		String bloodGroup = sc.nextLine();
//		System.out.println(bloodGroup);
//		System.out.println("Please enter your course name ");
//		String course = sc.nextLine();
//		System.out.println(course);
//		System.out.println("Enter your age");
//		int age = sc.nextInt();
//		System.out.println(age + "years");
//		System.out.println("Enter your Mobile Number ");
//		long ll = sc.nextLong();
//		System.out.println(ll);
//		System.out.println("Thanks for providing your details, "+name+"!");

		// ============================================

		String name, bloodGroup, course;
		int age;
		long mobileNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of the student :");
		name = sc.nextLine();
		System.out.println("Enter student blood group :");
		bloodGroup = sc.nextLine();
		System.out.println("Enter student course :");
		course = sc.nextLine();
		System.out.println("Enter Student age :");
		age = sc.nextInt();
		System.out.println("Enter Student mobile number :");
		mobileNumber = sc.nextLong();
		System.out.println("Display student details :: \n ");
		System.out.println("Name          : " + name);
		System.out.println("BloodGroup    : " + bloodGroup);
		System.out.println("Course        : " + course);
		System.out.println("Age           : " + age);
		System.out.println("Mobile Number : " + mobileNumber);

	}

}
