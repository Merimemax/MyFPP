package assignment4_4;

public class Rectangle implements Polygon {
	private final int width;
	private final int length;
	private final static int NUM_SIDES = 4;

	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public int getNumberOfSides() {
		return NUM_SIDES;
	}

	@Override
	public double computePerimeter() {
		return 2 * (width + length);
	}

}
