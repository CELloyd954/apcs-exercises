import java.util.Scanner;
public class CheckCharge
{
	public static void main(String[] args) {
		System.out.println("Enter checking amount: ");
		Scanner scan = new Scanner(System.in);
		int checking = scan.nextInt();

		System.out.println("Enter savings amount: ");
		int savings = scan.nextInt();

		double charge = 0.00;
		if (checking <= 1000 || savings <=1500) {
			charge = 0.15;
		} else {
			charge = 0.009;
		}

		System.out.println("Service charge is $" + charge + " per check.");
	}
}