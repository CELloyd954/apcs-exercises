import java.util.Scanner;
public class Y2KProblemDetector
{
	public static void main(String[] args) {
		System.out.println("Year of birth: ");
		Scanner scan = new Scanner(System.in);
		int birthYear = scan.nextInt();
		int fullBirthYear = 0;
		if (birthYear < 20) {
			fullBirthYear = 2000 + birthYear;
		}else if (birthYear >= 20) {
			fullBirthYear = 1900 + birthYear;
		}
		System.out.println("Current year: ");
		int currentYear = scan.nextInt();
		int fullCurrentYear = 0;
		if (currentYear + birthYear < 100) {
			fullCurrentYear = 2000 + currentYear;
		}else {
			fullCurrentYear = 1900 + currentYear;
		}
		int age = fullCurrentYear - fullBirthYear;
		System.out.println("Your age is: " + age);
	}
}