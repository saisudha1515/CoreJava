/*Method Overriding means, The process of re-implementing the parent class non static methods in the sub class by maintaining same method signature but with different implementation..
 For method overriding inheritance is mandatory (i.e, for method inheritance we required 2 classes minimum but for method overloading we required only single class means no need of Inheritance)..
 We have to use @Override annotation in sub class only for the override methods and should not use for not override methods..
 we can override only non static methods because non static methods are having multiple copies.whenever we create object, copy will be generated..
 we can not override static methods since static methods are having only single copy..
 this keyword is used to difference the local and non static variables..
 and this keyword represents current class object..
 this() statement will be used to call a constructor inside another constructor with in the same class
 super() statement is used to call parent class constructor in the sub class 
 super()can be revoked by compiler by default.but this() will be called by user explicitly , compiler will not call.
 super(), this() can be parameterized or non parameterized   
 by default super() is non parameterized statement.. we can also provide super()explicitly suppose if we don't provide then compiler will provide but not this() statement..
*/

package Method_Overriding;

public class Program1 {

}
