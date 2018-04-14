package assignment2p3;

public class Prog3 {

	public static void main(String[] args) {
		// 1.27, 3.881, 9.6
		float num1 = 1.27f;
		float num2 = 3.881f;
		float num3 = 9.6f;

		int sum = (int) (num1 + num2 + num3);
		int sumRounded = Math.round(num1 + num2 + num3);

		System.out.println("sum :" + sum);
		System.out.println("Sum rounded :" + sumRounded);
	}

}
