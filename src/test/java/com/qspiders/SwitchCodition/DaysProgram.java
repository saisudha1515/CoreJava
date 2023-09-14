// WAP to take input from user and display the day accordingly
package com.qspiders.SwitchCodition;

public class DaysProgram {
	public static void main(String[] args) {
		int choice = 7;
		String resultDay = null;
		switch (choice) {
		case 1:
			resultDay = "Sunday";
			System.out.println("Day : " + resultDay);
			break;

		case 2:
			resultDay = "Monday";
			System.out.println("Day : " + resultDay);
			break;

		case 3:
			resultDay = "Tuesday";
			System.out.println("Day : " + resultDay);
			break;

		case 4:
			resultDay = "Wednesday";
			System.out.println("Day : " + resultDay);
			break;

		case 5:
			resultDay = "Thursday";
			System.out.println("Day : " + resultDay);
			break;

		case 6:
			resultDay = "Friday";
			System.out.println("Day : " + resultDay);
			break;

		case 7:
			resultDay = "Saturday";
			System.out.println("Day : " + resultDay);
			break;

		default:
			System.out.println("Wrong input! Please enter valid input with from Sunday to Saturday ");
			break;
		}

	}
}
