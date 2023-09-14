// Program to store marks scored in 5 different subjects and display the total and average..
package Arrays;
import java.util.Scanner;
public class StudentMarks_Sum_And_Average {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);// Scanner is used to store the values..
//		int subject[] = new int[5];         // backgroung one student array will be created with size 5
//		int noOfSubjects = subject.length;  
//		System.out.println("Enter Student Marks for different subjets : ");
//		int sum = 0;    // int sum =0;
//		for (int i = 0; i < subject.length; i++) {
//			subject[i] = sc.nextInt();
//		}
//		System.out.println("marks stored : ");
//		for (int i = 0; i < subject.length; i++) {
//			System.out.println(subject[i]);
//			sum = sum + subject[i];
//		}
//		System.out.println("Total marks scored in 5 different subjects : " + sum);
//		double average = sum / noOfSubjects;
//		System.out.println("Average marks scored                       : " + average);

		
		// Jaggu sir program
		
		int subject[] = new int[5];
		int total =0;
		double average = 0.0;
		double count = subject.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks scored in 5 subjects : ");
		for(int i=0;i<subject.length;i++) {
			subject[i]=sc.nextInt();
			total = total+subject[i];
		}
		average = total/count;
		System.out.println("Total marks scored : "+total);
		System.out.println("Average            : "+average);
	}

}
