package assignment4_5;

public class Triangle implements Polygon {

	final double side1, side2, side3;

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public double[] getArrayOfSides() {
		double[] sides = { side1, side2, side3 };
		return sides;
	}

}
