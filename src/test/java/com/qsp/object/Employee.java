// as soon as object is created i.e, if any employee added then the empId will keep on increase it self automatically..
// we have to return toString() and hashCode()methods..
package com.qsp.object;

public class Employee {
	String name; // NSV
	int empId; // NSV
	
	static int count = 100; // static variable // remove static and check all em'ees will have same id so keep static..

	Employee(String name) {
		this.name = name;
		this.empId = hashCode();
	}
	 @Override     // if you want to print 
	 public int hashCode() {
		 return ++count;     // ++count means first it will increase the count and then print the value [count++ ---> means, first print the value and then increase the value count ]
	 }
	 @Override
	 public String toString() {
		 return "Name    : "+name+"\nEmpId   : "+empId+"\n";
	 }

	public static void main(String[] args) {
		Employee e1 = new Employee("James");
		Employee e2 = new Employee("Gosling");
		Employee e3 = new Employee("Sir");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println("\nhashCode of the objects\n----------------------------------");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
	}
}
