//Program to demonstrate compatibility of type of arguments with type of parameter`
package basedOn_Inputs;

public class Program2 {
	public static void show(byte a) {
		System.out.println("byte type parameter ");
	}

	public static void main(String[] args) {
		// show(567); // not allowed here because 567 is considered as int type
		show((byte) 567); // converted 127 to byte and then passed..
	}
}
