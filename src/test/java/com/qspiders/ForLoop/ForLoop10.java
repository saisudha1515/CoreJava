/* WAP to check a number is a Prime or not */
package com.qspiders.ForLoop;
public class ForLoop10 {
	public static void main(String[] args) {
		int num = 7;
		int count = 0;
		System.out.println(num + " factos are : ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i); // as soon as i get the factor i want to count the number of factors so take
										// count as 0 and and once get the factor increase count.....
				count++;
			}
		}
		System.out.println("Count of the factos are : " + count);
		if (count == 2) {
			System.out.println(num + " is Prime");
		} else {
			System.out.println(num + " is not a Prime, hence " + num + " has more than 2 factors");
		}
	}
}
