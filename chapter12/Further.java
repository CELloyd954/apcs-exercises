import java.util.Scanner;
public class Further
{
	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner scan1 = new Scanner(System.in);
		String originalString = scan1.nextLine();
		System.out.println("Enter beginning index: ");
		Scanner scan2 = new Scanner(System.in);
		int beginIndex = scan2.nextInt();
		System.out.println("Eneter ending index: ");
		Scanner scan3 = new Scanner(System.in);
		int endingIndex = scan3.nextInt();
		String newString = originalString.substring(beginIndex, endingIndex);
		System.out.println(originalString);
		System.out.println(newString);
	}
}