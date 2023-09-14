package basedOn_Inputs;
public class ParameterizedMethod3_MethodOverLoading {
	public static void m1() {
		System.out.println("no Paramaters ");
	}

	public static void m2(byte b) {
		System.out.println("byte Parameter ");
	}

	public static void m3(int n) {
		System.out.println("int Paramater ");
	}

	public static void m4(long z) {
		System.out.println("long Paramater ");
	}

	public static void m5(String str) {
		System.out.println("Stirng Parameter ");
	}

	public static void m6(char ch) {
		System.out.println("char paramater ");
	}

	public static void m7(double dou) {
		System.out.println("double paramater ");
	}

	public static void m8(float f) {
		System.out.println("float Parameter ");
	}

	public static void main(String[] args) {
		m1(); // no Paramaters
		m2((byte) 767); // byte Parameter
		m3(5677); // int Paramater
		m4(34); // long Paramater
		m5("java"); // Stirng Parameter
		m6('7'); // char paramater
		m7(567.88); // double paramater
		m8(5554654.98f); // float Parameter

	}

}
