package Method_Overriding;

public class Child extends Parent {
	@Override
	public void m1() {
		System.out.println("I am parent class m1()method , implemented in child class");
	}

	@Override
	public void m2() {
		System.out.println("I am parent class m2() method, implemented in child class");
	}
}
