package assignment3p4;

public class Triangle {
	private double base;
	private double hight;
	private double area;

	public Triangle(double base, double hight) {
		this.base = base;
		this.hight = hight;
		area = (base * hight) / 2;
	}
	public Triangle(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3)/2;
		 area = Math.sqrt(s * (s-side1) *(s-side2) *(s-side3));
	}
	
	public double computeArea() {
		return area;
	}

	public double getBase() {
		return base;
	}

	public double getHight() {
		return hight;
	}
}
