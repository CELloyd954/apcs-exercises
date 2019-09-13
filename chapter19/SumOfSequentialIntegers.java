import java.util.Scanner;
public class SumOfSequentialIntegers
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr N: ");
		int n = scan.nextInt();

		int i = 1;
		int sum1 = 0;
		while (i >= 1 && i <= n) {
			sum1 += i;
			i++;
		}

		int sum2 = (n * (n + 1)) / 2;

		System.out.println("Sum = " + sum1);
		System.out.println("Sum = " + sum2);
	}
}