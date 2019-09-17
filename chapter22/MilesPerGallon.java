import java.util.Scanner;
public class MilesPerGallon
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Miles Per Gallon Program");
		System.out.println("Initial miles: ");
		int initial = scan.nextInt();

		int finalMiles = 0;
		int gallons = 0;
		double mpg = 0;
		while (initial > -1) {
			System.out.println("Final miles: ");
			finalMiles = scan.nextInt();
			System.out.println("Gallons: ");
			gallons = scan.nextInt();

			mpg = (finalMiles - initial) / gallons;
			System.out.println("Miles per gallon: " + mpg);
			
			System.out.println("\n");
			System.out.println("Initial miles: ");
			initial = scan.nextInt();

		}

		if (initial < 0) {
			System.out.println("bye");
		}
	}
}