import java.util.Scanner;
public class FactorialWithErrorFlag {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int number = scan.nextInt();
		int factorial = number;

		for (int i = number; i > 1; i--) {
			factorial *= (i - 1);
		}

		if (number >= 0 && number < 21) {
			System.out.println("Factorial of " + number + " is " + factorial);
		} else {
			System.out.println("-1");
		}

	}
}