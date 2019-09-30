public class SheepHerdSize
{
	public static void main(String[] args) {
		double n = 20.0;
		double power = 1.0;
		for (int i = 0; i <= 25; i++) {
			n = 220 / (1 + 10 * power);
			power *= 0.83;
			System.out.println("Year " + i + ": " + n);
		}
	}
}