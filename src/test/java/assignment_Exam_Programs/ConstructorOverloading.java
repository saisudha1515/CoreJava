//Write a program for constructor overloading..
package assignment_Exam_Programs;
public class ConstructorOverloading {
	int age;
	long cellNo;
	String name;
	String collegeName;

	public ConstructorOverloading(int age, long cellNo, String name, String collegeName) {
		this.age = age;
		this.cellNo = cellNo;
		this.name = name;
		this.collegeName = collegeName;
	}

	public ConstructorOverloading(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public ConstructorOverloading(String collegeName, String name, int age, long cellNo) {
		this.collegeName = collegeName;
		this.age = age;
		this.cellNo = cellNo;
		this.name = name;
	}

	public String toString() {
		return "Name : " + name + "\nAge : " + age + "\nCellNo : " + cellNo + "\nCollegeName : " + collegeName + "\n";
	}

//	public void displayDetails() {
//		System.out.println("Name         : " + name);
//		System.out.println("Age          : " + age);
//		System.out.println("Cell no      : " + cellNo);
//		System.out.println("College Name : " + collegeName);
//		System.out.println();
//	}

	public static void main(String[] args) {
		ConstructorOverloading co = new ConstructorOverloading(10, 5454444645454l, "SAI", "PVKK");
		ConstructorOverloading co1 = new ConstructorOverloading("PALLAVI", 30);
		ConstructorOverloading co2 = new ConstructorOverloading("NARAYANA", "AMMU", 20, 6654325267456850l);
//		co.displayDetails();
//		co1.displayDetails();
//		co2.displayDetails();
		System.out.println(co);
		System.out.println(co1);
		System.out.println(co2);

	}

}
