package logicalProgramsByPawan;
/*Polyndrom number is a number which remains same when reverse it's digits of number..*/
import java.util.Scanner;

public class PalindromNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int originalNum = num;
		//Step1 : Reverse the given number
		int rev = 0;
		while(num!=0) {
			rev = rev*10+num%10;// get the last digit of number
			num = num/10;       // delete the last digit from the number
		}
		System.out.println("Reverse number is : "+rev);
		System.out.println("Original Number is : "+originalNum);
		//Step2 : After reversing the number, compare the reverse number with original number if both are same then number is polyndrom number if not not polyndrom..
		if(originalNum==rev) {
			System.out.println(originalNum+" is Polyndrom number");
		}
		else {
			System.out.println(originalNum+" is not a Polyndrom number");
		}
	}
}
