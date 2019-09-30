import java.util.Scanner;
import java.util.Random;
public class GuessingGame
{
	public static void main(String[] args) {
		System.out.println("I am thinking of a number between 1 and 10. You must guess what it is in 3 tries.");

		Scanner scan = new Scanner(System.in);
		
		Random rand = new Random();
		int number = rand.nextInt(9) + 1;
		for (int i = 1; i <=3; i++) {
			System.out.println("Enter a guess: ");
			int guess = scan.nextInt();
			if (guess == number && i <= 3) {
				System.out.println("RIGHT!");
			} else if (i <= 3 && guess != number) {
				System.out.println("WRONG U FOOL!");
			} else if (i > 3) {
				System.out.println("The correct number was " + number);
				System.out.println("You're a disappointment.");
			}
		}
	}
}