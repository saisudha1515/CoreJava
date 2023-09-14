/* Draw the below Pattern   //// take 2 columns as a single column so,here 6 columns will become 3 columns...

1 6 11 16 21
2 7 12 17 22
3 8 13 18 23
4 9 14 19 24
5 10 15 20 25

*/

package com.qspiders.NestedForLoop;

public class Program18 {
	public static void main(String[] args) {

		for (int row = 1; row <= 5; row++) {

			int sum = row; // if you declare here it will accept but above outer for loop it wont accept
							// because row is not yet decalred there ... // Sum lo unna value ni row lo
							// print cheyali....so assign row to sum 1st row last lo unna value tho 2nd row
							// start avvali so, sum lo unna value ni row ki assign cheyali

			for (int col = 1; col <= 5; col++) {
				System.out.print(sum + " ");
				sum += 5;
			}
			System.out.println();
		}
	}
}
