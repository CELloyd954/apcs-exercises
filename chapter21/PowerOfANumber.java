import java.util.Scanner;
public class PowerOfANumber
{
	public static void main(String[] args) {
		System.out.println("Enter X: ");
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();

		System.out.println("Enter N: ");
		int n = scan.nextInt();

		boolean positive = false;
		if (n > 0) {
			positive = true;
		} else {
			System.out.println("N must be positive. Try again: ");
			n = scan.nextInt();
		}

		double answer = 1;
		int i = 1;
		while (positive && i <= n) {
			answer *= x;
			i++;
		}

		System.out.println(x + " raised to the power of " + n + " is: " + answer);
	}
}