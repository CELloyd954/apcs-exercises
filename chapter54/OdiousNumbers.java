import java.util.Scanner;
public class OdiousNumbers {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		boolean positive = true;
		int number = 0;
		String binary = "";

		while (positive) {

			System.out.println("Enter a positive integer (negative to end code): ");
			number = scan.nextInt();

			if (number < 0) {
				positive = false;
			} else {
				for (int i = number; i > 0; i /= 2) {
					if (i % 2 == 1) {
						binary += "1";
					} else if (i % 2 == 0) {
						binary += "0";
					}
					positive = false;
				}
				System.out.println(binary);
				positive = true;

				int totalOnes = 0;
				for (int i = 0; i < binary.length(); i++) {
					if (binary.substring(i, i + 1).equals("1")) {
						totalOnes += 1;
					}
				}
				if (totalOnes % 2 == 1) {
					System.out.println("Number is odious!");
				} else {
					System.out.println("Number is evil!");
				}
				binary = "";

			}


		}

	}
}