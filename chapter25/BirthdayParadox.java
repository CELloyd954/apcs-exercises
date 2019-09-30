import java.util.Scanner;
public class BirthdayParadox
{
	public static void main(String[] args) {
		System.out.println("Enter number of guests: ");
		Scanner scan = new Scanner(System.in);
		double n = scan.nextDouble();

		double probability = 1.0;
		double guests = 0;
		for (double i = 1; i <= n; i++) {
			if (n < 366) {
				probability *= ((365 - i) / 365);
			} else {
				probability = 0.0;
			}
			if (probability >= 0.5) {
				guests = i;
			}	
		}

		System.out.println("Probability ( no shared birthdays among " + n + " people): " + probability);
		System.out.println(guests + " guests");


	}
}