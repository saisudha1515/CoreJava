package logicalProgramsByPawan;

import java.util.Scanner;

/**
 * for this we need to satisfy three conditions 1.Array should not contain
 * duplicate elements 2.Elements need not to be stored in the sorted
 * order(Elements can be stored can be stored in any order) 3.Elements should
 * follow range(range in the scence starting and ending index/position should be there)
 * 
 * 1.1st we need to find the sum of the array elements 
 * 2. 2nd we need to find the sum of range of values.. ex the range is 1 to 100 then we have to find the sum for  1 to 100..
 */
public class FindMissingNumberInAnArray {
	public static void main(String[] args) {
		int sum1 = 0,sum2 = 0;
		int num[] = new int[9];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements into the array : ");
		for(int i =0;i<num.length;i++) {
			num[i]= sc.nextInt();
		}
		for(int i =0;i<num.length;i++) {
			sum1 = sum1+num[i];
		}
		System.out.println("sum1 :"+sum1);
		// Write normal for loop to find the sum of range of values.
		for(int i = 1; i<= 10;i++) {
			sum2 = sum2+i;             // here add i not num[i]
		}
		System.out.println("Sum2 : "+sum2);
		int missingElement = sum2 - sum1;
		System.out.println("Missing element : "+missingElement);
    
	}
}
