//WAP to store a number and display whether ut is ARMSTRONG NUMBER or not
package InterviewQuestions;

public class Question1 {
	public static void main(String[] args) {
		int num = 153, count = 0, sum = 0, digit;
		int original = num;
		int copy = num;
		do // getting number of digits count
		{
			digit = num % 10;
			count++;
			num = num / 10;
		} while (num != 0);                             // here num becomes 0 so store the actual number in a variable called "original"
		System.out.println("Count of digits of a number is        : " + count);
		System.out.println("num                                   : " + num);

		do                                              // getting the sum of cube of digits
		{
			digit = original % 10;                      // fetch last digit
			sum = sum + (int) Math.pow(digit, count);   // this returns decimal value and we declared sum datatype as int
														// so we can't store double in int so, forcefully convert this
														// double into int..
			original = original / 10;
		} while (original != 0);                        // here again the original value becomes 0 so again take the copy of actual
								                      	// number and store in a variable called "copy"
		System.out.println("The original Number is               : " + original);
		System.out.println("The Sum of cube of digits of cube is : " + sum);
		System.out.println("The Actual Number  i.e, copy of a number  is  : " + copy);
		if (copy == sum) {
			System.out.println(copy + " is an ARMSTRONG NUMBER ");
		} else {
			System.out.println(copy + " is not an ARMSTRONG NUMBER ");
		}

		// ====================================== ( or ) ==============================================================================================

		int num1 = 153;
		int actualOrOriginalNumber = num1;
		int count1 = 0, sum1 = 0, digit1;
		do {
			digit1 = num1 % 10;
			count1++;
			num1 = num1 / 10;
			sum1 = sum1 + (int) Math.pow(digit1, count);  // pow() returns double,,, forcefully converting the double into int , it is called Explicit Conversion...
			// sum1=sum1+digit1*digit1*digit1;
		} while (num1 != 0);
		System.out.println("The count of digits of a number is     : " + count1);
		System.out.println("Sum of the cube of digits of number is : " + sum1);
		System.out.println("The Number is                          : " + actualOrOriginalNumber);
		if (actualOrOriginalNumber == sum1) {
			System.out.println(actualOrOriginalNumber + " is an Armstrong Number ");
		} else {
			System.out.println(actualOrOriginalNumber + " is not an Armstrong NUmber ");
		}
	}
}
