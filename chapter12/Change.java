import java.util.Scanner;
public class Change
{
	public static void main(String[] args) {
		System.out.println("Input change: ");
		Scanner scan = new Scanner(System.in);
		int change = scan.nextInt();
		int dollars = change / 100;
		int cents = change - (dollars * 100);
		int quarters = cents / 25;
		cents = cents - (quarters * 25);
		int dimes = cents / 10;
		cents = cents - (dimes * 10);
		int nickels = cents / 5;
		cents = cents - (nickels * 5);
		int pennies = cents;
		System.out.println("Your change is: " + dollars + " dollars " + quarters + " quarters " + dimes + " dimes " + nickels + " nickels " + " and " + pennies + " pennies.");
	}
}