package assignment4_5;

public class Rectangle implements Polygon {

	private double width;
	private double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public double[] getArrayOfSides() {
		double[] sides = { width, length, width, length };
		return sides;
	}

}
