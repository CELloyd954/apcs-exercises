import java.util.Scanner;
public class AnnualAppCost
{
	public static void main(String[] args) {
		System.out.println("Enter cost per kilowatt-hour in cents: ");
		Scanner scan1 = new Scanner(System.in);
		double cents = scan1.nextDouble();

		System.out.println("Enter kilowatt-hours used per year: ");
		double hours = scan1.nextDouble();

		double annual = cents * hours / 100;
		System.out.println("Annual cost: " + annual);
	}
}