package assignment4_2;

public class Rectangle extends ClosedCurve {
	private double width;
	private double length;
	

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}


	@Override
	double computeArea() {
		return width * length;
	}
}
