public class DegRad
{
	public static void main(String[] args) {
		double deg = 30;
		double rad = deg * Math.PI/180;
		double sinx = Math.sin( rad );
		double cosx = Math.cos( rad );
		double sum = (sinx * sinx) + (cosx * cosx);
		System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sum);
	}
}