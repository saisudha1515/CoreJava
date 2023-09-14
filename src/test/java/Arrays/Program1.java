// Array is a non premitive data type
package Arrays;
public class Program1 {
	public static void main(String[] args) {
		int num[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int sizeOfArray = num.length;
		System.out.println("Size or number of elements are present in Array : " + sizeOfArray);
		System.out.println("Elements stored in integer array : ");
//	for(int i =0;i<num.length;i++) {
//		System.out.print(num[i]+" | ");
//	}
//	
		for (int i = 0; i < sizeOfArray; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
//here num is object..