package assignment3p4;

public class Rectangle {
	private double width;
	private double hight;

	public Rectangle(double width, double hight) {
		this.width = width;
		this.hight = hight;
	}

	public double computeArea() {
		return width * hight;
	}

	public double getWidth() {
		return width;
	}

	public double getHight() {
		return hight;
	}

}
