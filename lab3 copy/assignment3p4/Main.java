package assignment3p4;

public class Main {

	public static void main(String[] args) {

		Triangle tri = new Triangle(1, 1);
		Rectangle rec = new Rectangle(4, 6);
		Circle cir = new Circle(5);

		System.out.println("Area of Triangle is " + tri.computeArea());
		System.out.println("Area of Rectangle is " + rec.computeArea());
		System.out.println("Area of Circle is " + cir.computeArea());

		//////// ------ B O N A S -------/////////////
		
		System.out.println("----Bonas----");

		Triangle tri3 = new Triangle(1, 1, Math.sqrt(2));
		
		System.out.printf("Array of Triangle is : %.2f", tri3.computeArea());

	}

}
