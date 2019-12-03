import java.util.Scanner;
public class ClosestToZero {
	public static void main(String[] args) {
		
		int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};

		int closest = 100;

		for (int i = 0; i < data.length; i++) {
			if (Math.abs(data[i]) < closest) {
				closest = data[i];
			}
		}
		System.out.println(closest);

	}
}