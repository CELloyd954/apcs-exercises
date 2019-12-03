import java.util.Scanner;
public class TwoLargest {
	public static void main(String[] args) {
		
		int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};

		int largest = 0;
		int second = 0;
		int[] sub = new int[data.length - 1];

		for (int i = 0; i < data.length; i++) {
			if (data[i] > largest) {
				largest = data[i];
			} 
		}
		System.out.println(largest);

		for (int j = 0; j < data.length; j++) {
			if (data[j] > second && data[j] != largest) {
				second = data[j];
			}
		}
		System.out.println(second);
	}
}