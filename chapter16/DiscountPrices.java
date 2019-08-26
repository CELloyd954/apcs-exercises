import java.util.Scanner;
public class DiscountPrices
{
	public static void main(String[] args) {
		System.out.println("Enter amount of purchases: ");
		Scanner scan = new Scanner(System.in);
		int purchases = scan.nextInt();
		if (purchases > 1000) {
			int discount = purchases * 9 / 10;
			System.out.println("Discounted price: " + discount);
		}else{
			System.out.println("Price: " + purchases);
		}
	}
}