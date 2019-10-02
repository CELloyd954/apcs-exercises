import java.util.Scanner;
import java.util.Random;
public class TwoDRandomClass
{
	public static void main(String[] args) {
		System.out.println("Enter times: ");
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();

		Random rand = new Random();

		double x = 0.0;
		double y = 0.0;
		for (int i = 0; i <= times; i++) {
			x += rand.nextDouble() * 2 - 1.0;
			y += rand.nextDouble() * 2 - 1.0;
		}

		double distance = Math.sqrt((x * x) + (y * y));
		System.out.println("(" + x + ", " + y + ") \nDistance: " + distance);
	}
}