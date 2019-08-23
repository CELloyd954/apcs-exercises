import java.util.Scanner;
public class BrickDistance
{
	public static void main(String[] args) {
		System.out.println("Enter the number of seconds: ");
		Scanner scan = new Scanner(System.in);
		double t = scan.nextDouble();
		double distance = (0.5) * 9.8 * t * t;
		System.out.println("Distance: " + distance);
	}
}