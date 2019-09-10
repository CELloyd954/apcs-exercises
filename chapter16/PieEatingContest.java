import java.util.Scanner;
public class PieEatingContest
{
	public static void main(String[] args) {
		System.out.println("Enter contestant's weight: ");
		Scanner scan = new Scanner(System.in);
		int weight = scan.nextInt();
		if (weight <= 280 && weight >= 220) {
			System.out.println("You can compete!");
		}else{
			System.out.println("Sorry, you can't compete.");
		}
	}
}