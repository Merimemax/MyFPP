package assignment2p2;

import java.util.Random;

public class RandomNumbers {

	private static Random random;

	public RandomNumbers() {
		random = new Random();
	}

	public  int getRandomInt() {
		if (random == null)
			new RandomNumbers();
		return random.nextInt();
	}

	public  int getRandomInt(int lower, int upper) {
		if (lower > upper)
			return 0;
		if (lower == upper)
			return lower;
		
		int difference = upper - lower;
		int start = getRandomInt();
		
		start = Math.abs(start) % (difference + 1);

		start += lower;
		return start;
	}

}
