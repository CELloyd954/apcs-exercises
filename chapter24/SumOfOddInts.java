import java.util.Scanner;
public class SumOfOddInts
{
	public static void main(String[] args) {
		System.out.println("Enter N: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int sumOdds = 0;
		int sumSquare = 0;
		for (int i = 1; i <= n; i += 2) {
			sumOdds += i;
			sumSquare = n * n;
		}

		System.out.println("Sum of odds before N: " + sumOdds);
		System.out.println("N squared: " + sumSquare);
	}
}