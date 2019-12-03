import java.util.Scanner;
public class ReversalOfElements {
	public static void main(String[] args) {
		
		int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int[] sub = new int[data.length];

		for (int i = 0; i < data.length; i++) {
			sub[i] = data[data.length - i - 1];
			System.out.println(sub[i]);
		}
	}
}