package PatternWithSwitch;

public class Program1 {
	public static void main(String[] args) {
		int choice = 2;
		int num = 5;
		switch (choice) {
		case 1:
			for (int i = 1; i <= num; i++) {
				if (i == 1) {
					System.out.println("The below pattern is Square ");
				}
				for (int j = 1; j <= num; j++) {
					if (i == 1 || i == 5 || j == 1 || j == 5) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;

		case 2:
			for (int i = 1; i <= 3; i++) {
				if (i == 1) {
					System.out.println("The below pattern is Rectangular ");
				}
				for (int j = 1; j <= num; j++) {
					if (i == 1 || i == 3 || j == 1 || j == 5) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;

		case 3:
			for (int i = 1; i <= num; i++) {
				if (i == 1) {
					System.out.println("The below pattern is X ");
				}
				for (int j = 1; j <= num; j++) {
					if (i == j || i + j == 6) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;

		case 4:
			for (int i = 1; i <= num; i++) {
				if (i == 1) {
					System.out.println("The below pattern is Z ");
				}
				for (int j = 1; j <= num; j++) {
					if (i == 1 || i + j == 6 || i == 5) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		default:
			for (int i = 1; i <= num; i++) {
				if (i == 1) {
					System.out.println("The below pattern is neither square, rectangular, Z and X ");
				}
				for (int j = num; j >= 1; j--) {
					if (i >= j) {
						System.out.print("1");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		}
	}

}
