public class Cylinder {

	private double volume;
	private double radius;
	private double height;
	private double sa;

	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	public double volume(double radius, double height) {
		return Math.PI * radius * radius * height;
	}

	public double sa(double radius, double height) {
		return (2 * Math.PI * radius * radius * height) + (2 * Math.PI * radius * height);
	}

	public void setRadius() {
		this.radius = radius;
	}

	public void setheight() {
		this.height = height;
	}

	public double getRadius() {
		return this.radius;
	}

	public double getHeight() {
		return this.height;
	}

}