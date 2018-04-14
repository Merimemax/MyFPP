package assignment4_5;

public class Square implements Polygon {

	private final double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double[] getArrayOfSides() {
		double[] sides = { side, side, side, side };
		return sides;
	}
}
