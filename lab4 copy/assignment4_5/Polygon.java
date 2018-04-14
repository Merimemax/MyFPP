package assignment4_5;

public interface Polygon {
	public double[] getArrayOfSides();
	static double sum(double[] arr) {
		double sum = 0;
		for(double side: arr) {
			sum += side;
		}
		return sum;
	}

	default double computePerimeter() {

		return sum(this.getArrayOfSides());
	}
}
