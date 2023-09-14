package ProgramsOnVariables_DataTypes_Operators_IfElse;

public class SimpleInterest {
	public static void main(String[] args) {
		int principle = 20000;
		double rateOfInterest = 10.5, time = 5.5, simpleInterest = (principle * time * rateOfInterest) / 100;
		System.out.println("Principle Amout   :" + " Rs" + principle);
		System.out.println("Time              :" + time + " Years");
		System.out.println("Rate of Interest  :" + rateOfInterest + " %");
		System.out.println("Simple Interest   :" + " Rs" + simpleInterest);
	}
}
