package Arrays;
import java.util.Scanner;
public class CountOf_Even_And_Odd_Numbers {
	public static void main(String[] args) {
//		int evenCount = 0,oddCount =0;
//		int arr[] = new int[10];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Numbers : ");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		System.out.println("Numbers stored : ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println("Even numbers stored : ");
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 0) {
//				System.out.println(arr[i]);
//				evenCount++;
//			}
//		}
//		System.out.println("Even numbers stored count : " + evenCount);
//		System.out.println("Odd values stored : ");
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 != 0) {
//				System.out.println(arr[i]);
//				oddCount++;
//			}
//		}
//		System.out.println("Odd numbers stored count  : " + oddCount);

		int num[] = new int[10];
		Scanner sc = new Scanner(System.in);
		int evenCount = 0, oddCount = 0;
		System.out.println("Enter Numbers : ");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt(); // during entering number only i am increasing even and odd numbers count based
									// on count..
			if (num[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		// loop to display even nos separately
		System.out.println("Even numbers are : ");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.println(num[i]);
			}
		}
		System.out.println("No.of even numbers are : " + evenCount);
		// loop to display odd nos separately
		System.out.println("Odd numbers are : ");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				System.out.println(num[i]);
			}
		}
		System.out.println("No.of odd numbers are : " + oddCount);
	}

}
