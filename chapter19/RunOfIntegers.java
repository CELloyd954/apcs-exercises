import java.util.Scanner;
public class RunOfIntegers
{
	public static void main(String[] args) {
		System.out.println("Enter starting value: ");
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();

		System.out.println("Enter ending value: ");
		int end = scan.nextInt();

		System.out.println("\n");
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}
	}
}