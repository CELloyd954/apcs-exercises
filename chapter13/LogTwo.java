import java.util.Scanner;
public class LogTwo
{
	public static void main(String[] args) {
		System.out.println("Enter a double: ");
		Scanner scan = new Scanner(System.in);
		double input = scan.nextDouble();
		double logbase = Math.log(input) / Math.log(2);
		System.out.println("Base 2 log of " + input + " is " + logbase);
	}
}