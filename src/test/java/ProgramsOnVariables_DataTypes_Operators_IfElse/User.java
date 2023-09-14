/*
Write to input unit price and quantity of a product? Calculate the total cost.
Discount will get if the purchase price is  greater than 18000 otherwise discount will be 10% and also calculate net cost to be paid */

package ProgramsOnVariables_DataTypes_Operators_IfElse;

class Bill {
	public static void generateBill(double price, int quantity) {
		double dis = 0;
		double netPrice = 0.0;
		// double totalCost= price*quantity;
		double totalCost = Math.ceil(price * quantity);
		double netCost = 0.0;

		if (totalCost > 18000) {
			dis = (totalCost * 30) / 100;
		} else {
			dis = (totalCost * 10) / 100;
		}
		// netCost = totalCost-dis;
		netCost = Math.ceil(totalCost - dis);

		System.out.println("**** Welcome to D-Mart,Anantapur ****");
		System.out.println("Price of the Product     : RS." + price);
		System.out.println("Quantiyt of the Product : " + quantity + " units");
		System.out.println("Total Cost              : RS." + totalCost);
		System.out.println("Discount                : RS." + dis);
		System.out.println("Net price to be paid    : " + netCost);
		System.out.println("**** Thank you, Visit again ****");
	}
}

public class User {
	public static void main(String[] args) {
		Bill.generateBill(25.5755655, 180046);
	}
}
