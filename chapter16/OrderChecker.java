import java.util.Scanner;
public class OrderChecker
{
	public static void main(String[] args) {
		System.out.println("Number of bolts: ");
		Scanner scan = new Scanner(System.in);
		int bolts = scan.nextInt();
		System.out.println("Number of nuts: ");
		int nuts = scan.nextInt();
		System.out.println("Number of washers: ");
		int washers = scan.nextInt();
		int total = (bolts * 5) + (nuts * 3) + washers;
		if (washers >= (bolts * 2) && nuts >= (bolts * 2)) {
			System.out.println("Total cost: " + total);
		}else if (washers >= (bolts * 2) && nuts < (bolts * 2)){
			System.out.println("Check the Order: too few nuts" + "\nTotal cost: " + total);
		}else if (washers > (bolts * 2) && nuts >= (bolts * 2)){
			System.out.println("Check the Order: too few washers" + "\nTotal cost: " + total);
		}else if (washers < (bolts * 2) && nuts < (bolts * 2)){
			System.out.println("Check the Order: too few nuts and washers" + "\nTotal cost: " + total);
		}
	}
}