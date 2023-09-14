package constructerChaining;

import java.util.Scanner;

public class Super_Call_Statement {
	public static void main(String[] args) {
		System.out.println("May I know your good name please ?");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine(); // accepting input from user..
		System.out.println("Hey!" + name + ", how are you!!");
		System.out.println("Please enter your age");
		int age = s.nextInt();
		System.out.printf("Your age is " + age + "years\n"); // \n means next line..
		System.out.println("Please enter your salary");
		float salary = s.nextFloat();
		System.out.printf("Thanks for saying your salary %s \n", salary);
		String que = s.nextLine();
		System.out.println("Do you have any Questions ? ");
		String issue = s.nextLine();
		if (issue.equalsIgnoreCase("no")) {
			System.out.println("Ok..Thanks! Thanks for your time, Have a great day a head!");
		} else if (issue.equalsIgnoreCase("Yes")) {
			System.out.println("Hey! " + name + "," + " May i know your problem please..");
			String problem = s.nextLine();
			System.out.println("Hey do not worry ,i will help you on this " + problem + " issue");
			System.out.printf("Thakns! %s Bye ", name + "!!");
		} else {
			System.out.println("I mood is not good ");
		}

	}
}
