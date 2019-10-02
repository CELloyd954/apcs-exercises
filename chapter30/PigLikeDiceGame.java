import java.util.Scanner;
import java.util.Random;
public class PigLikeDiceGame
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		int compCount = 0;
		int playerCount = 0;

		String answer = "";

		int playerRoll = 0;

		boolean playerTurn = false;
		while (playerCount < 100 && compCount < 100) {
			while (!playerTurn) {
				int roll1 = rand.nextInt(6) + 1;
				int roll2 = rand.nextInt(6) + 1;
				int roll3 = rand.nextInt(6) + 1;
				compCount += roll1 + roll2 + roll3;
				playerTurn = true;
			}


			if (playerTurn) {
				playerRoll = rand.nextInt(6) + 1;
			}
			if (playerRoll == 1) {
				System.out.println("You got a 1 :(");
				playerCount += 0;
				System.out.println(playerCount);
				playerTurn = false;
			}
			while (playerRoll != 1 && playerTurn) {
				System.out.println("Player: " + playerCount);
				System.out.println("Computer: " + compCount);
				System.out.println("\n" + playerRoll + " Would you like to roll again? yes/no");
				answer = scan.nextLine();
				playerCount += playerRoll;
				playerRoll = rand.nextInt(6) + 1;
				if (answer.equals("yes")) { 	
				 	playerTurn = true;	
				} else if (answer.equals("no")) {
					playerTurn = false;
					System.out.println("End of turn.");
				}

			} 
			
			
		}

		String winner = "";
		if (playerCount >= 100) {
			winner = "Player";
		} else if (compCount >= 100) {
			winner = "Computer";
		}
		System.out.print("The " + winner + " won.");
	}
}