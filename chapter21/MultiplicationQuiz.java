import java.util.Scanner;
import java.util.Random;
public class MultiplicationQuiz
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		int right = 0;
		for (int i = 0; i < 10; i++) {
			int one = rand.nextInt(10);
			int two = rand.nextInt(10);
			int answer = one * two;
			System.out.println("What is " + one + "* " + two + "?");
			int userAnswer= scan.nextInt();
			if (userAnswer == answer) {
				System.out.println("Right!");
				right += 1;
			} else {
				System.out.println("Wrong stupid!");
			}

		}

		System.out.println("Noice! You got " + right + " out of 10 questions correct!");
	}
}