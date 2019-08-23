import java.util.Scanner;
public class OhmsLaw
{
	public static void main(String[] args) {
		System.out.println("Input the voltage: ");
		Scanner scan1 = new Scanner(System.in);
		int v = scan1.nextInt();
		System.out.println("Input the resistance: ");
		Scanner scan2 = new Scanner(System.in);
		int r = scan2.nextInt();
		double i = (v + 0.0) / r;
		System.out.println("The current is: " + i);
	}
}