import java.util.Scanner;
public class PantryTester {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Jam goose = new Jam("Gooseberry", "7/4/86", 12);
		Jam apple = new Jam("Crab Apple", "9/30/99", 3);
		Jam rhub = new Jam("Rhubarb", "10/31/99", 3);

		Pantry hubbard = new Pantry(goose, apple, rhub);
		System.out.println(hubbard);

		boolean range = false;

		String jam = "";

		boolean valid = true;
		while (valid) {
			System.out.println("Enter your selection: ");
			int selection = scan.nextInt();
			hubbard.select(selection);
			if (selection == 1 || selection == 2 || selection == 3) {
				range = true;
				valid = false;
			} else if (selection == -1) {
				range = false;
				valid = false;
			} else {
				range = false;
				valid = true;
				System.out.println("Invalid. Enter your selection again: ");
				selection = scan.nextInt();
			}
			if (range) {
				System.out.println("Enter amount to spread: ");
				int sprdAmount = scan.nextInt();

				hubbard.spread(sprdAmount);

				System.out.println(hubbard);
				valid = true;
			}

			String mixOption = "";
			System.out.println("Would you like to check for mixed fruits? -> y/n");
			mixOption = scan.nextLine();
			mixOption = scan.nextLine();
			if (mixOption.equals("y")) {
				range = false;
				hubbard.mixedFruit();
				System.out.println(hubbard);
			} 

		}	


	}
}