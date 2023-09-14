package logicalProgramsByPawan;
/**
 * Here we have to use something in java called regular expression. 
 * *****   ^ it is called carrot symbol ex: [^a-zA-Z0-9] --> it is called regular expression..which means except this replace all with the specified character.
 * use regular expression with replaceAll() method..
 */
public class RemoveJunk_Or_SpecialCharacter_FromTheString {
	public static void main(String[] args) {
		String str = "@#$&*()#$%^*(#$&*()^&*($%^&*Selenium Java324789045689";
		String ss = str.replaceAll("[^a-zA-Z0-9]", ""); // replace with empty character not even with space " "..
		// str = str.replaceAll("[^a-zA-Z0-9]", "");  //store in the same variable or take different variable..
		System.out.println("After removing special Character and Junnk in the String is : "+ss);
		
		
	}

}
