import java.util.Scanner;
public class AllElements {
	public static void main(String[] args) {
		
		int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};

		int allSum = 0;
		int oddSum = 0;
		int evenSum = 0;

		for (int i = 0; i < data.length; i++) {
			allSum += data[i];
		}

		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 0) {
				evenSum += data[i];
			}
		}

		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 1) {
				oddSum += data[i];
			}
		}

		System.out.println("Sum of all: " + allSum + "\nSum of evens: " + evenSum + "\nSum of odds: " + oddSum);

	}
}