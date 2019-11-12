public class ImmutableBox {
	public static void main(String[] args) {
		
		Box box = new Box(2.5, 5.0, 6.0);
		Box box2 = new Box(box);
		Box box3 = Box.biggerBox(box);
		Box box4 = new Box(2.0, 4.5, 5.7);

		System.out.println("Box with width: " + box.getWidth() + ", height: " + box.getHeight() + ", and length: " + box.getLength());
		System.out.println("Area: " + box.sa(box.getWidth(), box.getHeight(), box.getLength()));
		System.out.println("Volume: " + box.volume(box.getWidth(), box.getHeight(), box.getLength()));

		System.out.println("\nBox with width: " + box2.getWidth() + ", height: " + box2.getHeight() + ", and length: " + box2.getLength());
		System.out.println("Area: " + box2.sa(box2.getWidth(), box2.getHeight(), box2.getLength()));
		System.out.println("Volume: " + box2.volume(box2.getWidth(), box2.getHeight(), box2.getLength()));

		System.out.println("\nBox with width: " + box3.getWidth() + ", height: " + box3.getHeight() + ", and length: " + box3.getLength());
		System.out.println("Area: " + box3.sa(box3.getWidth(), box3.getHeight(), box3.getLength()));
		System.out.println("Volume: " + box3.volume(box3.getWidth(), box3.getHeight(), box3.getLength()));

		System.out.println("\nBox with width: " + box4.getWidth() + ", height: " + box4.getHeight() + ", and length: " + box4.getLength());
		System.out.println("Area: " + box4.sa(box4.getWidth(), box4.getHeight(), box4.getLength()));
		System.out.println("Volume: " + box4.volume(box4.getWidth(), box4.getHeight(), box4.getLength()));
		System.out.println(Box.testBox(box, box4));

	}
}