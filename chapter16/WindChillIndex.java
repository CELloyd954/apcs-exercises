import java.util.Scanner;
public class WindChillIndex
{
	public static void main(String[] args) {
		System.out.println("Enter wind speed; ");
		Scanner scan = new Scanner(System.in);
		int windSpeed = scan.nextInt();

		System.out.println("Enetr temperature: ");
		int temp = scan.nextInt();

		double windChill;
		if (windSpeed < 3 || temp > 50) {
			windChill = temp;
		} else {
			windChill = 35.74 + (0.6215 * temp) - (35.75 * (Math.pow(windSpeed, 0.16))) + (0.4275 * temp * (Math.pow(windSpeed, 0.16)));
		}

		System.out.println("Wind Chill: " + windChill);
	}
}