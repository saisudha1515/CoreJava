package logicalProgramsByPawan;

import java.util.Arrays;

// Use Arrays Class and its static method equals()  .... import Arrays Class from java.util package..
public class CheckEqualitiesOfArray {
	public static void main(String[] args) {
		
		
		// Approach1 : By using Arrays Class and its method equals();
		int a1[] = { 1, 2, 3, 4, 5 };
		int a2[] = { 1, 2, 2, 4, 5 };
		/*boolean status = Arrays.equals(a1, a2);
		if(status == true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}*/
		
		
		
		
		
		//Approach2: 
		/**
		 * 1st check whether 2 arrays are equal or not if 2 arrays are equal then only we can check the equality of the array 
		 * 2nd check extract each and every element and check whether equal or not
		 */
		boolean status1 = true;
		if(a1.length==a2.length) {
			for(int i = 0; i<a1.length;i++) { // both arrays length is equal so we can take any array length..
				//put negative condition here if any one array element is not same then make the status as false..
				if(a1[i]!=a2[i]) {
					status1 = false;
				}
			}
		}else {
			status1 = false;
		}
		
		if(status1 == true) {
			System.out.println("Arryas are equal ");
		}else {
			System.out.println("Arrays are not equal");
		}
	}
	
}
