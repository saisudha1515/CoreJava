package logicalProgramsByPawan;

public class FindDuplicateElementInTheArray {
	public static void main(String[] args) {
		// Approach1 : Here we need to take 2 forloops one is for repeat all the elements of array and another loop is for compare one element with the rest of the values
		/*
		 * one loop is for iterate/repeat all the elements of array and another loop is
		 * for comparing each element with rest of the elements..like linear search
		 * 
		 */
		String arr[] = { "sai", "sudha", "Sai", "paru", "pandu", "priya" };
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) { // first take sai and compare this with all the remaining elements so sai index position is 0 so j will be i+1(i.e, 1).. if i = 1 then next value  will be 2 if i = 2 next value will be 3 and so on..
				if (arr[i] == arr[j]) {
					System.out.println("Found Duplicate element in the Array");
					flag = true;
					break; // as soon as found duplicate element then make the status as true and stop the execution..so use break statement.
				}
			}
		}
        if(flag == false) {
        	System.out.println("Duplicate element not found");
        }
	}
}
