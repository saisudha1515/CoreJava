/*Back ground each and every cell index is associated with array variable.. like arr[0],arr[1],arr[2]....arr[i]// Array is a contiguous memory location which is used to store multiple number of homogeneous type of elements..
we can create array in 2 ways ie
1. Directly (when oyu cretating array directly we must have to initialize the values/ elements during decalration itself..
2.By using new keyword.. in this case we have to declare the size..	and this size should aiways be positive only.. count always in positive integer only. we should not declare double,or negative integers..
Array store elements where as String stores characters
When you create array, background one object will be created when object is created non static variables will be loaded in the object..which means once you create the array if you don't store element into the array the default values will be stored..
int num[]= new int[4];
System.out.println(num[0]);
for(int i=0;i<num.length;i++){
System.out.println(num[i]);   here we are not storing the values into the array then,default values will be 
}
*/

package Arrays;
import java.util.Scanner;
public class BasicArrayProgram {
	public static void main(String[] args) {
		// Creating array Directly in this case we have to initialize the elements during declaration itself..
//			int i[]= {10,20,30,40,50};
//			int le = i.length;
//			System.out.println("No of elements are stored in array or size of array : "+le);
			
			
			// Creating array by using new keyword
			Scanner sc = new Scanner(System.in);
			int num[]= new int[5]; // array has created with size 5 or 5 cells..
			System.out.println("Enter values/elements into array : ");  // why i=0 means array index starts with 0 and i want store elements from 0 index 
			for(int i=0;i<num.length;i++ ) {  // here for loop is like block which means the variables which we are using here will applicable only with in this block..so we can reuse these local variables outside of this block so, can use in another for loop..
				 num[i]=sc.nextInt();
			}
			System.out.println("Storred values into the array : ");
			for(int i=0;i<num.length;i++) {
				System.out.println(num[i]);
			}
			
			
			
		}


}
