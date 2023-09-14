// return type of split() is String[] (String array) 
// split() will split the String into multiple elements based on the given String..
package com.qsp.stringprograms;
public class Split_Method {
public static void main(String[] args) {
	String str = "Panjagutta is one of the best place in Hydrerabad every one should visit atleast once in their life.. ok ";
	String[] result = str.split(" ");
	int count = 0;
	for(String rr : result) {
		System.out.println(rr);
		count++;
	}
	System.out.println("No.of words present in the sentence : "+count);
}
}
