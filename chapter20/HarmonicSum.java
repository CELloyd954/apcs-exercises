import java.util.Scanner;
public class HarmonicSum
{
	public static void main(String[] args) {
		System.out.println("Enter N: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		double sum = 0;
		int i = 1;
		while (i > 0 && i <= n) {
			sum += 1.0/i;
			i++;
		}

		System.out.println("Sum is: " + sum);
	}
}