//hashCode()
/*hash code is different and object address is differnt, because we can chaange/overide the hashcode but we can't fetch and can't change the object address.*/
package com.qsp.object;

public class HashCodeMethod {
	public static void main(String[] args) {
		HashCodeMethod hc1 = new HashCodeMethod();
		HashCodeMethod hc2 = new HashCodeMethod();
		System.out.println(hc1);
		System.out.println(hc2);
		System.out.println(hc1.hashCode());   // hash code is nothing but unique identification number that was given by JVM for each and every object.. Technically that unique identification number is called as HashCode of the object..
		System.out.println(hc2.hashCode()); 
	}
}
