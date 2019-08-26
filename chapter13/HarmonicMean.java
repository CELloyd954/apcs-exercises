import java.util.Scanner;
public class HarmonicMean
{
	public static void main(String[] args) {
		System.out.println("Enter X: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println("Enter Y: ");
		int y = scan.nextInt();
		double mean = (x + y)/2;
		double harmonic = 2.0 / (1.0/x + 1.0/y);
		System.out.println("Arithmetic mean: " + mean);
		System.out.println("Harmonic mean: " + harmonic);
	}
}