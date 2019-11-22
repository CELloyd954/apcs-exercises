import java.util.Scanner;
public class Combinations {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("enter N: ");
		int n = scan.nextInt();

		System.out.println("enter R: ");
		int r = scan.nextInt();

		int nFactorial = n;
		int rFactorial = r;
		int bothFactorial = (n - r);
		int nCr = 0;

		for (int i = n; i > 1; i--) {
			nFactorial *= (n - 1);
		}

		for (int j = r; j > 1; j--) {
			rFactorial *= (r - 1);
		}

		for (int k = (n - r); k > 1; k--) {
			bothFactorial *= ((n - r) - 1);
		}

		nCr = nFactorial / (rFactorial * bothFactorial);
		if (n >= 0 && n < 21) {
			System.out.println(nCr);
		} else {
			System.out.println("-1");
		}

	}
}