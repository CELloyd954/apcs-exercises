import java.util.Scanner;
public class GroundBeefValue
{
	public static void main(String[] args) {
		System.out.println("Price per pound package A: ");
		Scanner scan = new Scanner(System.in);
		double priceA = scan.nextDouble();
		System.out.println("Percent lean package A: ");
		int leanA = scan.nextInt();
		System.out.println("Price per pound package B: ");
		double priceB = scan.nextDouble();
		System.out.println("Percent lean package B: ");
		int leanB = scan.nextInt();
		double packageACost = priceA * 100 / leanA;
		double packageBCost = priceB * 100 / leanB;
		System.out.println("Package A cost per pound of lean: " + packageACost);
		System.out.println("Package B cost per pound of lean: " + packageBCost);
		if (packageACost < packageBCost) {
			System.out.println("Package A is the best value");
		}else if (packageBCost < packageACost) {
			System.out.println("Package B is the better value");
		}
	}
}