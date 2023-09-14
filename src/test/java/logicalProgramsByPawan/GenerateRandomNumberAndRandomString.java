package logicalProgramsByPawan;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumberAndRandomString {
	public static void main(String[] args) {
		//Approach1 : By Using Random Class
		Random r = new Random();
		int random_Integer = r.nextInt(1000); // provide bound. 1000 is the maximum bound.. which means it will generate random numbers in between 0 to 999 if bound is 100 then it will generate random numbers in between 0 to 99..
		System.out.println(random_Integer);
		// to Generate decimal random numbers and nextDouble() method generate in between the range of 0.0 and 1.1. // here no need to provide the bound..
		double random_Double = r.nextDouble();  
		System.out.println(random_Double);
		
		//Approach2
		// bY using Math Class we can generate only random decimal numbers not integer numbers.
		// In Math Class we have a static method called random() which will generate random decimal numbers in between 0.0 to 1.1
		System.out.println(Math.random());
		
		//Approach3 : By Using an API/ 3rd party tool called "Apache commons_lang" API download its jar and add to the project manually because these jars have the required classes and interfaces..
		String ranNum = RandomStringUtils.randomNumeric(10); //randomNumeric() return type is String..not int
		System.out.println(ranNum);
		String ranString = RandomStringUtils.randomAlphabetic(20);
		System.out.println(ranString);
		
		/**
		 * 
		 * Use RandomStringUtils class 
		 * Use 2 static methods like randomNumeric(10) for random number generation
		 * and randomAlphabetic(20) for random String generation
		 * 
		 */

	}
}
