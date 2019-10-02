import java.util.Scanner;
import java.util.Random;
public class SquareRootGame
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		 System.out.println("How many rounds?");
		 int rounds = scan.nextInt();
		 String nothing = scan.nextLine();
		 
		 System.out.println("First player, sign in: ");
		 String user1 = scan.nextLine();


		 System.out.println("Second player, sign in: ");
		 String user2 = scan.nextLine();

		 int count1 = 0;
		 int count2 = 0;

		 double guess1 = 0;
		 double guess2 = 0;
		 double number = 0.0;
		 double answer = 0.0;
		 double difference1 = 0.0;
		 double difference2 = 0.0;
		 for (int i = 1; i <= rounds; i++) {
		 	number = rand.nextDouble() * 100.0 + 1;
		 	System.out.println("What is the square root of " + number + "?");
		 	System.out.println(user1 + ", your guess is: ");
		 	guess1 = scan.nextDouble();

		 	System.out.println(user2 + ", your guess is: ");
		 	guess2 = scan.nextDouble();

		 	answer = Math.sqrt(number);
		 	System.out.println("The correct square root is: " + answer);

		 	difference1 = Math.abs(guess1 - answer);
		 	difference2 = Math.abs(guess2 - answer);

		 	System.out.println(user1 + " is " + difference1 + " away.");
		 	System.out.println(user2 + " is " + difference2 + " away.");

		 	if (difference1 > difference2) {
		 		System.out.println(user2 + " wins!!!");
		 		count2++;
		 	} else if (difference2 > difference1) {
		 		System.out.println(user1 + " wins!!!");
		 		count1++;
		 	}
		 	System.out.println("\n");
		 }

		 System.out.println("---- Final Score ----");
		 System.out.println(user1 + ":\t" + count1 + "\t" + user2 + ":\t" + count2);
	}
}