//WAP to store a number and display the sum of the cube of digits
package com.qspiders.Do_WhileLoop;
public class Program8 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		int cube = 1;
		do {
			int digit = num % 10;
			cube = digit * digit * digit;
			sum = sum + cube;
			// System.out.print(cube+" "); // 5*5*5=125 4*4*4*=64 3*3*3=27 2*2*2=8 1*1*1=1
			// System.out.print(sum+" "); // 0+125=125 125+64=189 189+27=216 216+8=224
			// 224+1=225
			num = num / 10;
		} while (num != 0);
		System.out.println("sum of a cube of digits of a number : " + sum);
	}
}
