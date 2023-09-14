package basedOn_Inputs;

public class ParameterizedMethod1_Axis {
	public static void transferMoney(long accountNo, int amount) { // these are local variables
		String name = "Saisudha";
		System.out.println("Money transferred successfully to : " + name);
		System.out.println("From account number               : " + accountNo);
		System.out.println("Amount transfered is              : " + "RS." + amount);
	}

	public static void main(String[] args) {
		transferMoney(12345689234L, 500000); // initialize long value by putting L or l at the end of the value because
												// by default numeric value is integer.... and decimal value is double
												// so put F/f at the end of value...
	}
}
