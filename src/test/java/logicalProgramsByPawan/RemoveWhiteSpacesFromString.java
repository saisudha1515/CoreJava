package logicalProgramsByPawan;

// use " \\s"(\\s--> it is regular expression .. \n,\t) for space and use replaceAll() method 
// when ever space occur there replace  the space with empty character""
public class RemoveWhiteSpacesFromString {
	public static void main(String[] args) {
		String str = " Welcome  to  Java   Sleenium ";
		System.out.println("String Before removing whitespaces : "+str);
	    str = str.replaceAll("\\s", "");
		System.out.println("String after removing whitespaces : "+str);

	}
}
