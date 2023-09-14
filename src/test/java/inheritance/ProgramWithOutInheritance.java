/* We can access one class members(variable,method,constructor,block and inner class)inside another class.we can only access but we don't have the copy of the class which is access in another class.. 
If we establish the relationship between the 2 classes we can have the copy of class members inside another class
Inheritance means the process of sharing one class properties to another class by using a keyword "extends" is called Inheritance..
We can achieve inheritance by using "extends" keyword..
The class which is sharing the properties is called Parent class or Base class or Super class and 
The class which is acquiring the properties is called Child class or Derived class or Sub class.. 
There are 4 types of inheritance i.e, Single level inheritance, Multi_level Inheritance, Multiple Inheritance, Hierarchial Inheritance..
Java does not support Hybrid Inheritance there is no concept of Hybrid Inheritance in java
Java does not support Multiple Inheritance because ambiguity problem  will arise..
We can achieve Multiple Inheritance with the help of Interface Concept..
Use of Inheritance is code re-usability/ code optimization(i.e, reduce the length of code )
When the child class implements it's own logic then the parent class and other class method will not get affected and the classes which are not implementing their own logic can use the parent class properties.. 

*/

package inheritance;

class Sample {
	public static int x = 10;
	public double y = 20.5;
}

public class ProgramWithOutInheritance {
	public static void main(String[] args) {
		System.out.println("Value stored in x is : " + Sample.x);
		System.out.println("Value stored in y is : " + new Sample().y);
	}
}
//here we are only accessing the Sample class members in ProgramWithOutInheritance class but we don't have copy of Sample class members in ProgramWithOutInheritance class. If we use inheritance concept we can get the copy inside another class.. 
