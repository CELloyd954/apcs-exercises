import java.util.Scanner;
public class InternetDelicatessen
{
	public static void main(String[] args) {
		System.out.println("Enter the item: ");
		Scanner scan = new Scanner(System.in);
		String item = scan.nextLine();

		System.out.println("Enter the price: ");
		double price = scan.nextDouble();

		System.out.println("Express delivery (0==no, 1==yes): ");
		int deliveryType = scan.nextInt();

		double deliveryCost = 0.00;
		if (deliveryType == 0 && price < 10) {
			deliveryCost = 2.00;
		} else if (deliveryType == 0 && price >= 10) {
			deliveryCost = 0.00;
		} else if (deliveryType == 1 && price < 10) {
			deliveryCost = 5.00;
		} else if (deliveryType == 1 && price >= 10) {
			deliveryCost = 3.00;
		} 

		double total = price + deliveryCost;
		System.out.println("Invoice: \n\t" + item + "\t\t" + price + "\n\tDelivery\t" + deliveryCost + "\n\tTotal\t\t" + total);
	}
}