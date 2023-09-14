/**********************
 Constructor  will be used to create Multiple Objects and it will difference the local and global variables.. and constructor is used to initialize the Non static variables..
 Method Overloading use is : Perform a same task or single same task in multiple ways 
 Constructor Chaining use is code re-usability..
 Inheritance use is code re-usability..
***********************/
// Program to demonstrate real time use of Static variable and non static variable..
//Static variables are used when data is common for all the objects.
package constructer_usage;

public class Student {
	// we should not initialize non static variables.. but have to initialize static
		// variables..
	//String name; //NSV
	//int  age;    //NSV
	//int rollNo;  //NSV
	//static String course  = "SDET";  //SV
	//public static void main(String[] args) {
//		Student s1 = new Student();
//		Student s2 = new Student();
//		Student s3 = new Student();
//		Student s4 = new Student();
	//	
//		s1.name = "ram";
//		s1.age = 25;
//		s1.rollNo = 565;
	//	
	//
//		s2.name = "kavya";
//		s2.age = 45;
//		s2.rollNo = 55;
	//	
	//
//		s3.name = "amul";
//		s3.age = 5;
//		s3.rollNo = 75;
	//	
	//	
//		System.out.println("Details of Student1 ");
//		System.out.println("-----------------------");
//		System.out.println("Name : "+s1.name);
//		System.out.println("Age : "+s1.age);
//		System.out.println("rollNo : "+s1.rollNo);
//		System.out.println("Course : "+course); //	System.out.println("Course : "+s1.course); can use but it is not recommended so have to call directly..don't use ref variable..
	//
	//
//		System.out.println("Details of Student2 ");
//		System.out.println("-----------------------");
//		System.out.println("Name : "+s2.name);
//		System.out.println("Age : "+s2.age);
//		System.out.println("rollNo : "+s2.rollNo);
//		System.out.println("Course : "+course); //	System.out.println("Course : "+s1.course); can use but it is not recommended so have to call directly..don't use ref variable..
	//
	//
	//	
//		System.out.println("Details of Student3 ");
//		System.out.println("-----------------------");
//		System.out.println("Name : "+s3.name);
//		System.out.println("Age : "+s3.age);
//		System.out.println("rollNo : "+s3.rollNo);
//		System.out.println("Course : "+course); //	System.out.println("Course : "+s1.course); can use but it is not recommended so have to call directly..don't use ref variable..
	//
	//
//		System.out.println("Details of Student4 "); // here we have initialized the NSV so, compiler will give default values to the NSV
//		System.out.println("-----------------------");
//		System.out.println("Name : "+s4.name);
//		System.out.println("Age : "+s4.age);
//		System.out.println("rollNo : "+s4.rollNo);
//		System.out.println("Course : "+course); //	System.out.println("Course : "+s1.course); can use but it is not recommended so have to call directly..don't use ref variable..

		// ==================================================================================================

	// this will increase the length of code and also the performance is low so go for Constructer to reduce the code...
	// initialize the NSV at the time of object creation.. Constructer will be called by JVM by defaultly when the object is created..
//		String name; //NSV
//		int  age;    //NSV
//		int rollNo;  //NSV
//		static String course  = "SDET";  //SV
	//	
//		public Student(String name, int age, int rollNo){
//			this.name  = name;
//			this.age = age;
//			this.rollNo = rollNo;
//			
//		}
	//	
//		public static void main(String[] args) {
//			Student s1 = new Student("bhargavi", 10, 101);
//			Student s2 = new Student("Ankitha", 20, 102);
//			Student s3 = new Student("Sasi", 30, 103);
//			Student s4 = new Student("ravikanth", 40, 104);
//			
//			
//			
//			System.out.println("Details of Student1 ");
//			System.out.println("-----------------------");
//			System.out.println("Name : "+s1.name);
//			System.out.println("Age : "+s1.age);
//			System.out.println("rollNo : "+s1.rollNo);
//			System.out.println("Course : "+course); //	System.out.println("Course : "+s1.course); can use but it is not recommended so have to call directly..don't use ref variable..
	//
	//
//			System.out.println("Details of Student2 ");
//			System.out.println("-----------------------");
//			System.out.println("Name : "+s2.name);
//			System.out.println("Age : "+s2.age);
//			System.out.println("rollNo : "+s2.rollNo);
//			System.out.println("Course : "+course); //	System.out.println("Course : "+s1.course); can use but it is not recommended so have to call directly..don't use ref variable..
	//
	//
//			
//			System.out.println("Details of Student3 ");
//			System.out.println("-----------------------");
//			System.out.println("Name : "+s3.name);
//			System.out.println("Age : "+s3.age);
//			System.out.println("rollNo : "+s3.rollNo);
//			System.out.println("Course : "+course); //	System.out.println("Course : "+s1.course); can use but it is not recommended so have to call directly..don't use ref variable..
	//
	//
//			System.out.println("Details of Student4 "); // here we have initialized the NSV so, compiler will give default values to the NSV
//			System.out.println("-----------------------");
//			System.out.println("Name : "+s4.name);
//			System.out.println("Age : "+s4.age);
//			System.out.println("rollNo : "+s4.rollNo);
//			System.out.println("Course : "+course); //	System.out.println("Course : "+s1.course); can use but it is not recommended so have to call directly..don't use ref variable..
	//

	// ******** again the code looks lengthy so use reusable method to print statements in order to reduce the code..

		String name; // NSV
		int age; // NSV
		int rollNo; // NSV
		static String course = "SDET"; // SV

		public Student(String name, int age, int rollNo) {
			this.name = name;
			this.age = age;
			this.rollNo = rollNo;
		}

		public void disPlayDetails() {
			System.out.println("Name : " + name);
			System.out.println("Age : " + age);
			System.out.println("rollNo :" + rollNo);
			System.out.println("Course : " + course);
			System.out.println();

		}

		public static void main(String[] args) {
			Student s1 = new Student("bhargavi", 10, 101);
			Student s2 = new Student("Ankitha", 20, 102);
			Student s3 = new Student("Sasi", 30, 103);
			Student s4 = new Student("ravikanth", 40, 104);

			s1.disPlayDetails();
			s2.disPlayDetails();
			s3.disPlayDetails();
			s4.disPlayDetails();
		}
}
