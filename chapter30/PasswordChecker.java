import java.util.Scanner;
import java.util.Random;
public class PasswordChecker
{
	public static void main(String[] args) {
		System.out.println("Enter a \"secret\" password please: ");
		Scanner scan = new Scanner(System.in);
		String password = scan.nextLine();

		Random rand = new Random();

		String choices = ("abcdefghijklmnopqrstuvwxyz");
		String guess = new String("");

		int count = 0;
		while (!guess.equals(password)) {
			guess = "";

			for (int i = 1; i <= password.length(); i++) {
				guess += choices.charAt(rand.nextInt(choices.length()));
			}

			count++;
		}

		System.out.print("Here is your password: " + guess);
		System.out.println("\nIt took " + count + " tries to guess it.");
	}
}