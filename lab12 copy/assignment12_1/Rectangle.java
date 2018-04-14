package assignment12_1;

public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	public Rectangle(Double width, Double length) throws IllegalClosedCurveException{
		this(width.doubleValue(), length.doubleValue());
	}
	public Rectangle(double width, double length) throws IllegalClosedCurveException{
		if(width < 0 || length < 0) throw new IllegalClosedCurveException(width + ", " + length + " Width or length of the rectangle cant be negetive numbers");
		this.length = length;
		this.width = width;
	}
	double computeArea() {
		return width*length;
	}
	


}
