package assignment10_2;

public class Main {

	public static void main(String[] args) {
		Rational oneThird = new Rational(1, 3);
		Rational twoThird = new Rational(2, 3);
		Rational sevFiv = new Rational(-17, 5);

		Rational r1 = twoThird.add(sevFiv.multiply(oneThird));
		Rational r2 = (twoThird.multiply(sevFiv)).add(oneThird);

		if (r1.compareTo(r2) < 0) {
			System.out.println("( " + twoThird + " x " + sevFiv + ") + " + oneThird + " is greater than " + twoThird
					+ " + (" + sevFiv + " x " + oneThird + ")");
		} else if (r1.compareTo(r2) > 0) {
			System.out.println(twoThird + " + (" + sevFiv + " x " + oneThird + ") is greater than (" + twoThird + " * "
					+ sevFiv + ") + " + oneThird);
		} else {
			System.out.println("(( " + twoThird + " * " + sevFiv + ") + " + oneThird + ") and (" + twoThird + " + ("
					+ sevFiv + " x " + oneThird + ")) are equal rational numbers");
		}

	}

}
