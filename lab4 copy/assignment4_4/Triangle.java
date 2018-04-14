package assignment4_4;

public class Triangle implements Polygon {
	private final static int NUM_SIDES = 3;
	final double side1, side2, side3;

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public int getNumberOfSides() {
		return NUM_SIDES;
	}

	@Override
	public double computePerimeter() {
		return side1 + side2 + side3;
	}

}
