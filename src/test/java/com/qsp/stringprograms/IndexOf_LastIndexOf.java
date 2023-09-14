/* indexOf()   :::  -1      i.e, firstIndexOf()
 * return type of indexOf()is int
 * indexOf()method is a overloaded method in the String class to perform operation in multiple ways which means we can get the position/index of character in multiple ways..
   it returns index/position of the given Character..
   if the character is not found in the given index then we get -1.if the character is found at given index then it will return the position of the character..
   if the character is available at multiple positions then we will get the first occurrence's of character index/position..
   
*/
package com.qsp.stringprograms;

public class IndexOf_LastIndexOf {
	public static void main(String[] args) {
		String str = "Qspiderisder";
		
		//indexOf()
		System.out.println(str.indexOf('Q'));
		System.out.println(str.indexOf('r'));
		System.out.println(str.indexOf("de")); // 4 ,give index position of s
		System.out.println(str.indexOf("rss")); // -1 because rss is not available in String "Qspiders"

		System.out.println();

		// lastIndexOf()
		System.out.println(str.lastIndexOf('p')); // 2
		System.out.println(str.lastIndexOf('u')); // -1 because character 'u' is not available in String "Qspiders"
		System.out.println(str.lastIndexOf("spi"));// 1 give position of s
		System.out.println(str.lastIndexOf("edgs"));// -1 because not available in String "Qspiders"
		System.out.println(str.lastIndexOf("rss"));
		System.out.println(str.lastIndexOf("rs"));// 6 given r index position from the last..
		System.out.println();
		System.out.println(str.lastIndexOf('i', 6));//3   which means index 6 lopala unna character i index position isthundi..
		System.out.println(str.lastIndexOf('m', 9));  //-1 index 9 lopala unna characters lo 'm' ledu so returns -1 as output
		System.out.println(str.lastIndexOf("der", 11));//9
		System.out.println(str.lastIndexOf("der", 19));//9
		System.out.println(str.lastIndexOf("der", 3));//-1
		


	}
}
