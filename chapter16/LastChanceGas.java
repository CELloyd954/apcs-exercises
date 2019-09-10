import java.util.Scanner;
public class LastChanceGas
{
	public static void main(String[] args) {
		System.out.println("Tank Capacity: ");
		Scanner scan = new Scanner(System.in);
		int tankCapacity = scan.nextInt();
		System.out.println("Gage reading: ");
		int gageReading = scan.nextInt();
		System.out.println("Miles per gallon: ");
		int mpg = scan.nextInt();
		int currentCapacity = tankCapacity * gageReading / 100;
		int possibleMiles = mpg * currentCapacity;
		if (possibleMiles >= 200) {
			System.out.println("Safe to proceed");
		}else{
			System.out.println("Get gas!");
		}
	}
}