package assignment7_1;

public class Main {

	public static void main(String[] args) {

		System.out.println(power(2, 10));

	}

	private static double power(double x, int n) {
		if (n == 0 || n == 1)
			return x;
		return x * power(x, n - 1);
	}
}
