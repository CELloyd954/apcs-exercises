import java.util.Scanner;
public class SumofDivisors
{
	public static void main(String[] args) {
		System.out.println("Enter N: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}

		System.out.println("Sum of divisors: " + sum);
	}
}