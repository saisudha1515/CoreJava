package ProgramsOnVariables_DataTypes_Operators_IfElse;

public class StudentMarksMemo {
	public static void main(String[] args) {
		int percentage = 59;
		System.out.println("****         Priya Charbhe's Marks Memo               ****");
		System.out.println("**** Standard       :: 10th                           ****");
		System.out.println("**** School Name    :: Narayana English Medium School ****");

		if (percentage > 80) {
			System.out.println("Grade of the student :: A+");
		} else if (percentage <= 80 && percentage > 70) {
			System.out.println("Grade of the student :: A");
		} else if (percentage <= 70 && percentage > 60) {
			System.out.println("Grade of the student :: B+");
		} else if (percentage <= 60 && percentage > 50) {
			System.out.println("Grade of the student :: B");
		} else if (percentage <= 50 && percentage > 40) {
			System.out.println("Grade of the student :: C");
		} else {
			System.out.println("Grade of the student :: FAIL");
		}
		System.out.println("****       Thank you!! All The Best!                        ****");
	}
}
