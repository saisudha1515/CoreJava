package logicalProgramsByPawan;

import java.util.Scanner;

public class ReverseOfNumber {
public static void main(String[] args) {
	//Logic1 : Using Algorithm
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number : ");
	int number = sc.nextInt();
//	int reverseNum = 0;
//	while(number!=0) {
//		reverseNum = reverseNum*10+number%10; //number%10 will capture last digit from the Number.
//		number = number/10;                   // number/10 will remove the last digit from the number..	
//    	}
//	System.out.println("Reverse Number is : "+reverseNum);
	
	//Logic2 : 
	StringBuffer sb = new StringBuffer(String.valueOf(number)); // pass the number as parameter which is we are accepting from the user as input..and use "valueOf()" to convert the int into String..
	StringBuffer revNum = sb.reverse();
	System.out.println("Reverse Number is : "+revNum);
	
	//Logic3 : 
	StringBuilder sbr = new StringBuilder(); // here no need to pass any parameter just append the user input to the variable called "sbr"
	sbr.append(number);  // now the variable is having the number and by calling reverse() just reverse the number..
	StringBuilder reverseNumber = sbr.reverse();
	System.out.println("Reverse Number is : "+reverseNumber);
    }
}
