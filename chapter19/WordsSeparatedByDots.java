import java.util.Scanner;
public class WordsSeparatedByDots
{
	public static void main(String[] args) {
		System.out.println("Enter first word: ");
		Scanner scan= new Scanner(System.in);
		String first = scan.nextLine();

		System.out.println("Enter second word: ");
		String second = scan.nextLine();

		String combined = first + second;
		
		String dots = "";
		int length = combined.length();
		while (length < 30) {
			length += 1;
			dots += '.';
		}

		System.out.println(first + dots + second);
	}
}