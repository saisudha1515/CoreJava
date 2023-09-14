package logicalProgramsByPawan;

import java.util.Scanner;
/*
 * Number should be natural number 
 * number should have exactly 2 factors.. 
 * 
 * 
 */

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int count = 0;
		//Step1 : Count the number of factors for the given number
		if(num>1) {
			for(int i = 1; i<=num; i++) {
		           if(num%i==0) {
		        	   System.out.println(i);
		        	   count++;
		           }
				}
				System.out.println("Number of factors of "+num+" is : "+count);
				//Step2 : Check the count if the count is 2 then the number is Prime number else not..
				if(count == 2) {
					System.out.println(num+" is Prime");
				}
				else {
					System.out.println(num+" is not Prime");
				}
		}
		else {
			System.out.println("Please enter natural number");
		}
		
	}
}
