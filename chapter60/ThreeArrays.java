public class ThreeArrays {
	public static void main(String[] args) {
		
		int[] valA = {13, -22, 82, 17};
		int[] valB = {-12, 24, -79, -13};
		
		int sum0 = valA[0] + valB[0];
		int sum1 = valA[1] + valB[1];
		int sum2 = valA[2] + valB[2];
		int sum3 = valA[3] + valB[3];

		int[] sum = {sum0, sum1, sum2, sum3};

		System.out.println(sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3]);

	}
}