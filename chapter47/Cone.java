public class Cone {

		private double height;
		private double radius;
		private double angle;

		public Cone(double height, double radius, double angle) {
			this.height = height;
			this.radius = radius;
			this.angle = angle;

		}

		public double area() {
			return Math.PI * radius * (radius + Math.sqrt((height * height) + (radius * radius)));
		}

		public double volume() {
			return Math.PI * radius * radius * height / 3;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}

		public double getHeight() {
			return this.height;
		}

		public double getRadius() {
			return this.radius;
		}

		public double getAngle() {
			return this.angle;
		}

		public double slantHeight(double radius, double height) {
			return Math.sqrt((radius * radius) + (height * height));
		}

		public double angle(double angle, double radius, double height) {
			return Math.atan(radius / height);
		}



}