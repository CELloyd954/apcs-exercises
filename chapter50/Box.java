public class Box {

	private double width;
	private double height;
	private double length;

	public Box(double width, double height, double length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}

	public Box( Box oldBox ) {
		this.width = oldBox.getWidth();
		this.height = oldBox.getHeight();
		this.length = oldBox.getLength();
	}

	public Box( Box oldBox, double size ) {
		this.width = oldBox.getWidth() * size;
		this.height = oldBox.getHeight() * size;
		this.length = oldBox.getLength() * size;
	}

	public static Box biggerBox(Box oldBox) {
		Box box = new Box(oldBox.getWidth() * 1.25, oldBox.getHeight() * 1.25, oldBox.getLength() * 1.25);
		return box;
	}

	public static boolean testBox(Box oldBox, Box newBox) {
		if (oldBox.getWidth() > newBox.getWidth() && oldBox.getHeight() > newBox.getHeight() && oldBox.getLength() > newBox.getLength()) {
			return true;
		} else {
			return false;
		}
	}


	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return this.width;
	}

	public double getHeight() {
		return this.height;
	}

	public double getLength() {
		return this.length;
	}

	public double faceArea(double width, double height) {
		return 2 * width * height;
	}

	public double topArea(double width, double length) {
		return 2 * width * length;
	}

	public double sideArea(double height, double length) {
		return 2 * height * length;
	}

	public double volume(double width, double height, double length) {
		return width * height * length;
	}

	public double sa(double width, double height, double length) {
		return faceArea(width, height) + topArea(width, length) + sideArea(height, length);
	}

}