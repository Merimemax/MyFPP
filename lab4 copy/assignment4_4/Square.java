package assignment4_4;

public class Square implements Polygon {
	private final double side;
	private final static int NUM_SIDES = 4;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public int getNumberOfSides() {
		return NUM_SIDES;
	}

	@Override
	public double computePerimeter() {
		return 2 * (side + side);
	}

}
