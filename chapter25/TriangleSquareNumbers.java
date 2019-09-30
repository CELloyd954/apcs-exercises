import java.util.Scanner;
public class TriangleSquareNumbers
{
	public static void main(String[] args) {
		System.out.println("Enter limit: ");
		Scanner scan = new Scanner(System.in);
		int limit = scan.nextInt();

		boolean square = false;
		boolean triangle = false;

		for (int i = 0; i <= limit; i++) {
			for (int iSquare = i; iSquare > 0; iSquare--) {
				if (iSquare * iSquare == i) {
					square = true;
				}
			}

			int nCount = 1;
			for (int n = 1; nCount <= limit; n++) {
				if (nCount == i) {
					triangle = true;
					n = limit + 1;
				}
				nCount += (n + 1);
			}

			if (square && triangle) {
				System.out.println(i + " is both");
			}

			square = false;
			triangle = false;
		}
	}
}