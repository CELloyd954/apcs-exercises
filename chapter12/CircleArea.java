import java.util.Scanner;
public class CircleArea
{
	public static void main(String[] args) {
		System.out.println("Input the radius: ");
		Scanner scan = new Scanner(System.in);
		int radius = scan.nextInt();
		double area = Math.PI * radius * radius;
		System.out.println("The radius is: " + radius + " The area is: " + area);
	}
}