public class CylinderClass {
	public static void main(String[] args) {
		
		Cylinder cylinder = new Cylinder(2.0, 4.5);

		System.out.println("Cylinder with radius: " + cylinder.getRadius() + " and height: " + cylinder.getHeight());
		System.out.print("has volume: " + cylinder.volume(cylinder.getRadius(), cylinder.getHeight()));
		System.out.println(" and surface area: " + cylinder.sa(cylinder.getRadius(), cylinder.getHeight()));

	}
}