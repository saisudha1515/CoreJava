package logicalProgramsByPawan;

/** LINEAR SEARCH COMPARE EACH AND EVERY ELEMENT WITH ALL THE REMAINING ELEMENTS..IN THE ARRAY..
 * How linear search works? 1st extract each and every element from the array
 * and compare the the extracted element with the rest of all the elements..
 * here i want to check whether my required number is available in the array or
 * not and do searching from the starting of the index..
 */
public class LinearSeach_In_Array {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int search_Element = 100;                    // check whether 40 is available in the array or not
		boolean flag = false;                       // default value of flag is false i.e, no duplicate
		//extract each and every element from array.
		for (int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
			// now i need to compate this search element with all rest of the elements 
			if(search_Element==arr[i]) {
				System.out.println("Element is found in Array at position "+i+" element is : "+search_Element); //as soon as found duplicate make the make the flag as true and break the loop..
				flag = true;
				break;
			}

		}
		if(flag == false) {
			System.out.println("Element is not found in Array"+" and the element is : "+search_Element);
		}
	}
}
