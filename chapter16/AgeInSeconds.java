import java.util.Scanner;
public class AgeInSeconds
{
	public static void main(String[] args) {
		System.out.println("Enter your age in years: ");
		Scanner scan = new Scanner(System.in);
		int userYears = scan.nextInt();

		System.out.println("Plus months: ");
		int userMonths = scan.nextInt();

		System.out.println("Plus days: ");
		int userDays = scan.nextInt();

		int[] monthData = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int monthDays = 0;
		for (int count = userMonths; count > 0; count--) {
			monthDays = monthDays + monthData[count -1];
		}

		int totalDays = monthDays + (userYears * 365) + userDays;

		int ageSeconds = totalDays * 60 * 60 * 24;
		System.out.println(ageSeconds);

		double percentage = 100 * ageSeconds / 2500000000.0;
		System.out.println(percentage + "%");
	}
}