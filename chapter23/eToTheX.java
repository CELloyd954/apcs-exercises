import java.util.Scanner;
public class eToTheX
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter x: ");
		double x = scan.nextDouble();

		double sum = 1;
		int n = 1;

		double term = 1;
		while (term > 1.0E-12) {
			term *= (x / n);
			n++;
			sum += term;
		}	

		System.out.println("my e^" + x + " is " + sum);

		double real = Math.exp(x);
		System.out.println("real answer is " + real);
	}
}