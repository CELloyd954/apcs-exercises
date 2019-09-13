import java.util.Scanner;
public class AddingUpIntegers
{
	public static void main(String[] args) {
		System.out.println("How many integers will be added?");
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();

		int sum = 0;
		int i = 1;
		int addition = 0;
		while (i > 0 && i <= times) {
			System.out.println("Enter an integer: ");
			addition = scan.nextInt();
			sum += addition;
			i++;
		}

		System.out.println("The sum is: " + sum);
	}
}