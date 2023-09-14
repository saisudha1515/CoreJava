// toString()method ::   when we use to string we must have to return in the form of String because toString()return type is String..
/*toString() is already overriden in some of the java predefined classes such as
  1. String
  2. String Builder
  3. String Buffer
  4. all Wrapper classes
  5. all Exception related classes
  */
package com.qsp.object;

public class ToStringMethod {
	int age;
	long cellNo;
	String name, fatherName;

	public ToStringMethod(int age, long cellNO, String name, String fatherName) {
		this.age = age;
		this.name = name;
		this.cellNo = cellNO;
		this.fatherName = fatherName;
	}

	public ToStringMethod(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public ToStringMethod(String name, long cellNo) {
		this.name = name;
		this.cellNo = cellNo;
	}

	public void displayDetails() {
		System.out.println("Name      : " + name);
		System.out.println("FatheName : " + fatherName);
		System.out.println("Age       : " + age);
		System.out.println("CellNo    : " + cellNo);
		System.out.println();
	}

	public String toString() { // here toString() is getting overridden because of that the content is
								// displaying.. if you comment this toString() then parent class toString()will
								// be executed when you try to print referance variable....
		return "Name       : " + name + "\nFatherName : " + fatherName + "\nAge        : " + age + "\nCellNo     : "
				+ cellNo + "\n";
	}

	public static void main(String[] args) {
		ToStringMethod s1 = new ToStringMethod(20, "sai");
		ToStringMethod s2 = new ToStringMethod("ramu", 90);
		ToStringMethod s3 = new ToStringMethod(30, 53652675325463250l, "ammu", "Kiran");
//		s1.displayDetails();
//		s2.displayDetails();
//		s3.displayDetails();
		System.out.println(s1); // when you display referance variable, parent class toString() will be invoked so we get fully qualified class name if we overide that parent class toString() then we get content of the object....
		System.out.println(s2);
		System.out.println(s3);
		
		

		// here in String class toString() is already overriden so we get content of
		// object i.e, James Gosling
		String str = new String("James Gosling");
		System.out.println(str);

	}

}
