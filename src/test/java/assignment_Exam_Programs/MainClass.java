//Write a program for method overriding
package assignment_Exam_Programs;
class Bus{
	public void m1() {
		System.out.println(" Please always do travel in Pallevelugu Bus");
	}
}
class LuxuryBus extends Bus{
	@Override
	public void m1() {
		System.out.println("No, I will tarvel only in Private Tarevels");
	}
}
public class MainClass {
	public static void main(String[] args) {
		LuxuryBus ll = new LuxuryBus();
		ll.m1();	
	}
}
