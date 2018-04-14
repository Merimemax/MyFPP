package assignment10_2;

public class Rational {
	private int denominator;
	private int numerator;

	Rational(int p) {
		this(p, 1);
	}

	Rational(int p, int q) {
		if (q <= 0) {
			throw new IllegalArgumentException(q + " denominator can't be less or equal to zero, Sorry Try other number");
		}
		denominator = q;
		numerator = p;
	}

	public Rational add(Rational rat) {
		int right = denominator * rat.numerator;
		int left = numerator * rat.denominator;
		int num = right + left;
		int den = denominator * rat.denominator;
		return new Rational(num, den);
	}

	public Rational multiply(Rational rat) {
		int num = numerator * rat.numerator;
		int den = denominator * rat.denominator;
		return new Rational(num, den);
	}

	public int compareTo(Rational rat) {
		int first = denominator * rat.numerator;
		int second = numerator * rat.denominator;
		return first - second;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + denominator;
		result = prime * result + numerator;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rational other = (Rational) obj;
		int num = denominator * other.numerator;
		int den = numerator * other.denominator;
		if (num != den)
			return false;

		return true;
	}

	@Override
	public String toString() {
		return numerator + "/" + denominator;
	}

}
