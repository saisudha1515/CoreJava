package ProgramsOnVariables_DataTypes_Operators_IfElse;

public class Student_MarksCard {
	public static void main(String[] args) {

		String name = "Amal", standard = "10th class", schoolName = "Narayana School";
		char gender = 'M', section = 'A';
		int telugu = 50, english = 60, maths = 70, social = 80, science = 88, age = 18;
		double hindi = 77.5, totalMarks = telugu + maths + social + science + english + hindi,
				percentage = totalMarks / 600 * 100;

		System.out.println("Telugu Marks               :" + " " + telugu);
		System.out.println("Maths Marks                :" + " " + maths);
		System.out.println("Social Marks               :" + " " + social);
		System.out.println("Science Marks              :" + " " + science);
		System.out.println("English Marks              :" + " " + english);
		System.out.println("Hindi Marks                :" + " " + hindi);
		System.out.println("Name of the Student        :" + " " + name);
		System.out.println("Standard                   :" + " " + standard);
		System.out.println("Section of the Student     :" + " " + section);
		System.out.println("School Name                :" + " " + schoolName);
		System.out.println("Student Gender             :" + " " + gender);
		System.out.println("Student Gender             :" + " " + age + " Years");
		System.out.println("Toatl Marks of the Student :" + " " + totalMarks);
		System.out.println("Percentage                 :" + " " + percentage);
	}

}
