package logicalProgramsByPawan;

public class OccuranceOfEachCharacterInString {
public static void main(String[] args) {
	String str = "Welcome to java Selenium and advanced courseraaaaa ";
	int totalCount = str.length();  // it will give the length of String(i.e, give the count of Characters in the String)
	System.out.println(totalCount);
	int totalCountAfterRemoving = str.replace("m", "").length();  // replace "a" with EMPTY/EMPTYCharacter there is no value
	System.out.println(totalCountAfterRemoving);
	int count = totalCount-totalCountAfterRemoving;
	System.out.println("Number of occurance of character a in the String : "+str+ "is : "+count);
     }
}
