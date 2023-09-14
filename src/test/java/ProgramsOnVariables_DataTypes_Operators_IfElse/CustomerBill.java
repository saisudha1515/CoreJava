package ProgramsOnVariables_DataTypes_Operators_IfElse;

public class CustomerBill {
	public static void main(String[] args) {
		int disPer = 20;
		int totalCost = 11000;
		int discount = (totalCost * disPer) / 100;
		if (totalCost <= 2000) {
			System.out.println("Total Cost                      : " + totalCost);
			System.out.println("Discount in terms of Percentage : " + disPer + "%");
			System.out.println("Discount given                  : RS." + discount);
			System.out.println("Gift                            : Calculator");
		} else if (totalCost > 2000 && totalCost <= 5000) {
			System.out.println("Total Cost                      : " + totalCost);
			System.out.println("Discount in terms of Percentage : " + disPer + "%");
			System.out.println("Discount given                  : RS." + discount);
			System.out.println("Gift                            : School Bag");
		} else if (totalCost > 5000 && totalCost <= 10000) {
			System.out.println("Total Cost                      : " + totalCost);
			System.out.println("Discount in terms of Percentage : " + disPer + "%");
			System.out.println("Discount given                  : RS." + discount);
			System.out.println("Gift                            : Wall Clock");
		} else {
			System.out.println("Total Cost                      : " + totalCost);
			System.out.println("Discount in terms of Percentage : " + disPer + "%");
			System.out.println("Discount given                  : RS." + discount);
			System.out.println("Gift                            : Wrist Clock");
		}
	}

}
