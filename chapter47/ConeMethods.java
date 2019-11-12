public class ConeMethods {
	public static void main(String[] args) {
		
		Cone cone = new Cone(4.0, 3.0, 30.0);

		System.out.println("Slant height = " + cone.slantHeight(cone.getRadius(), cone.getHeight()) + " \nArea = " + cone.area() + " \nVolume = " + cone.volume() + " \nApex angle = " + cone.angle(cone.getAngle(), cone.getRadius(), cone.getHeight()));

	}
}