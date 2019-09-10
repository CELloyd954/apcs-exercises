import java.util.Scanner;
public class TownDump
{
	public static void main(String[] args) {
		System.out.println("Enter weight (in pounds) of load: ");
		Scanner scan = new Scanner(System.in);
		int weight = scan.nextInt();

		double cost = 0.00;
		int extraHundreds = 0;
		if (weight <= 200) {
			cost = 20.00;
		} else if (weight > 200) {
			extraHundreds = (weight - 200) / 100;
			cost = 20.00 + (8.00 * extraHundreds);
		}
		System.out.println("Cost of load is $" + cost);
	}
}