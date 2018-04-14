package assignment4_4;

public class Test2 {

	public static void main(String[] args) {
		Polygon[] poly = { new Rectangle(3, 4), new Triangle(4, 5, 6), new Square(3) };

		for (Polygon p : poly) {
			String single = String.format("For this %s\n", p.getClass().getSimpleName());
			single += String.format("	Number of sides  %d\n", p.getNumberOfSides());
			single += String.format("	Perimeter  %.2f\n", p.computePerimeter());

			System.out.println(single);
		}
	}

}
