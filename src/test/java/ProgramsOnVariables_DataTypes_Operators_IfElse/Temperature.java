package ProgramsOnVariables_DataTypes_Operators_IfElse;

public class Temperature {
	public static void main(String[] args) {
		int degreeCelsius = 3;
		double degreeFarenheit = (degreeCelsius * 1.8) + 32;
		// double degreeFarenheit = (degreeCelsius*9/5)+32;
		System.out.println("Temperature in degreeCelsius      : " + degreeCelsius + " Celsius");
		System.out.println("Temperature in degreeFarenheit    : " + degreeFarenheit + " Farenheit");
	}
}
