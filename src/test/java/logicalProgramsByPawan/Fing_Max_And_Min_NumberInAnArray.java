package logicalProgramsByPawan;

import java.util.Scanner;

public class Fing_Max_And_Min_NumberInAnArray {
	public static void main(String[] args) {
		// Array Declaration
		int arr[] = new int[5];// If the array is having n elements then the index of array is n-1.. Index of array is "length-1"
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values/Elements into the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Stored vaiues in the array are : ");
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		// MAXIMUM NUMBER::
		int max = arr[0]; // take 0th index value as maximum number..and extract each and every number from the array and compare all each and every number with this maximum number..
		for(int i =1;i<arr.length;i++) { // here i =1 because i already taken 0th index so start from 1st index..
			if(arr[i]>max) {
				max = arr[i];
			}	
		}
       System.out.println("Maximum element of Array is : "+max);
		
	// MINIMUM NUMBER
		int min = arr[0];
		for(int i = 1; i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
	
	System.out.println("Minimum element of array is : "+min);
	
	
	}
}
