import java.util.Scanner;
public class CentsToDollars
{
	public static void main(String[] args) {
		System.out.println("Input the cents: ");
		Scanner scan = new Scanner(System.in);
		int data = scan.nextInt();
		int dollars = data / 100;
		int cents = data - (dollars * 100);
		System.out.println("That is " + dollars + " dollars and " + cents + " cents.");
	}
}